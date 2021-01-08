package com.porwau.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Models the version of a module.
 * 
 * @author Raphaël Aubert
 * @author Derek Labadie
 * @author © 2009 - Watch4Net Solutions
 */
public class Version implements Comparable<Version> {

	/**
	 * The separator between major and minor versions.
	 */
	private static final char MAJOR_MINOR_SEP = '.';

	/**
	 * The separator between minor and update versions.
	 */
	private static final char MINOR_UPDATE_SEP = 'u';
	private static final char MINOR_PATCH_SEP = '.';


	/**
	 * The version major number.
	 */
	protected final int major;

	/**
	 * The version minor numbers.
	 */
	protected final int[] minors;

	/**
	 * The version update number.
	 */
	protected final int update;

	/**
	 * Creates a new {@link Version} instance from the given attributes.
	 * 
	 * The last given value for the minors will always be evaluated as the update
	 * part. For example, "4.1u2" => <code>new ModuleVersion(4,1,2)</code> or "4.5"
	 * => <code>new ModuleVersion(4, 5, 0)</code>
	 * 
	 * @param major  the major number
	 * @param minors the minor numbers, followed by the update one; the last number
	 *               will always be the update one, so make sure to always pass '0'
	 *               as last number if there is no update number
	 */
	public Version(int major, int... minors) {
		System.out.println("Utkarsh - I am in Version constructor which takes minors as array " + major + " minors "
				+ Arrays.toString(minors));

		this.major = major;
		if (minors.length == 0) {
			this.minors = minors;
			this.update = 0;
		} else {
			// last 'minor' number is always the update number
			int idx = minors.length - 1;
			this.update = minors[idx];

			// remove trailing zeroes in minors
			for (int i = idx - 1; i >= 0; i--) {
				if (minors[i] != 0) {
					break;
				}
				idx--;
			}
			this.minors = ArrayUtils.subarray(minors, 0, idx);
		}
	}

	/**
	 * Creates a new {@link Version} instance from the given string.
	 * 
	 * @param version the version to parse
	 * @throws NumberFormatException if the version is not made of numbers
	 */
	public Version(String version) {

		System.out.println("Utkarsh - I am in string form of version and the version is " + version);
		int pos = version.indexOf(MAJOR_MINOR_SEP);
		if (pos < 0) {
			// we only have the major number
			this.major = Integer.parseInt(version);
			version = StringUtils.EMPTY;
		} else {
			// there's more than the major number
			this.major = Integer.parseInt(version.substring(0, pos));
			version = version.substring(pos + 1);
//			System.out.println("Utkarsh - remaining version after removing major is - " + version);
//
//			System.out.println("Utkarsh - remaining version length is - " + version.length());
		}

		if (version.length() == 0) {//this means nothing after major which is rare
			//this.minors = new int[0];//UTKARSH 
			this.minors = new int[] {0,0};//all zeros in minor
			this.update = 0;//
		} else {

//			System.out.println("Utkarsh - I have more than minor version - ");//process minor and update
			List<Integer> numbers = new ArrayList<Integer>(4);
			pos = version.indexOf(MAJOR_MINOR_SEP);

			while (pos >= 0) {
				numbers.add(Integer.parseInt(version.substring(0, pos)));// I am only adding minor and updates here
				version = version.substring(pos + 1);

//				System.out.println("Utkarsh - remiaing version is - " + version);
				pos = version.indexOf(MAJOR_MINOR_SEP);
			}
			

			pos = version.indexOf(MINOR_UPDATE_SEP);
			if (pos < 0) {//no u in string
				if (version.length() > 0) {
					numbers.add(Integer.parseInt(version));
				}
				//fill remaining of the two minors with 0.
				
				// no update specified; use '0'
				while(numbers.size()<3) {
				numbers.add(0);}
			} else {

//				System.out.println("Utkarsh - I have an update version");
				// update value is the last 'minor' number
				numbers.add(Integer.parseInt(version.substring(0, pos)));
				numbers.add(Integer.parseInt(version.substring(pos + 1)));
				if(numbers.size() == 2) {numbers.add(0);}

			}

			// last 'minor' number is always the update number--Utkarsh change this. logic 
			//this has update and minor, i need two numbers for minor and last if any for update.
			//TODO throw exception if more than 2 minors
			int idx = numbers.size() - 1;
			
//			this.update = numbers.get(idx);

			// Utkarsh commenting the logic to remove 0 from version.
			// The loop is for minor values having 0 in it
//			if (this.update == 0) {
//				for (int i = idx - 1; i >= 0; i--) {
//					if (numbers.get(i) != 0) {
//						break;
//					}
//					idx--;
//				}
//			}
			this.minors = new int[2];
			for (int i = 0; i < 2; i++) {
				this.minors[i] = numbers.get(i);
			}
			this.update = numbers.get(2);
		}
		System.out.println("Version is " + version + ", Major is " + this.major + ", Minors are " + Arrays.toString(this.minors) + ", Update is " + this.update);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(major).append(minors).append(update).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		Version rhs = (Version) obj;
		return new EqualsBuilder().append(major, rhs.major).append(minors, rhs.minors).append(update, rhs.update)
				.isEquals();
	}

	/**
	 * Compares this minor versions with the specified minor versions for order.
	 * Returns a negative integer, zero, or a positive integer as this minor
	 * versions are less than, equal to, or greater than the specified minor
	 * versions.
	 * 
	 * @param m     the minor versions to be compared
	 * @param count the maximum number of minor versions to be compared
	 * @return a negative integer, zero, or a positive integer as this minor
	 *         versions are less than, equal to, or greater than the specified minor
	 *         versions
	 */
	private int compareMinors(int[] m, int count) {
		System.out.println("Utkarsh - I am inside compareMinors with values or object and passed as "
				+ Arrays.toString(m) + " " + Arrays.toString(minors));

		int size = Math.max(minors.length, m.length);
		if (size > count) {
			size = count;
		}

		// when values start missing, it's the same as having all zeroes
		for (int i = 0; i < size; i++) {
			int lhs = i < minors.length ? minors[i] : 0;
			int rhs = i < m.length ? m[i] : 0;
			if (lhs < rhs) {
				return -1;
			} else if (lhs > rhs) {
				return 1;
			}
		}

		return 0;
	}

	/**
	 * This only compares the branches of the versions.
	 * 
	 * A branch is defined by all major and minor numbers.
	 * 
	 * @param o     The other version to compare to.
	 * @param count The maximum number of minor versions to be compared.
	 * @return Returns a negative integer, zero, or a positive integer as this
	 *         version branch is less than, equal to, or greater than the specified
	 *         version branch.
	 */
	public int compareBranch(Version o, int count) {
		int ret;

		if (major < o.major) {
			ret = -1;
		} else if (major > o.major) {
			ret = 1;
		} else {
			ret = compareMinors(o.minors, count);
		}

		return ret;
	}

	/**
	 * This only compares the branches of the versions.
	 * 
	 * A branch is defined by all major and minor numbers.
	 * 
	 * @param o The other version to compare to.
	 * @return Returns a negative integer, zero, or a positive integer as this
	 *         version branch is less than, equal to, or greater than the specified
	 *         version branch.
	 */
	public int compareBranch(Version o) {
		return compareBranch(o, Integer.MAX_VALUE);
	}

	/**
	 * This only compares the update number of the versions.
	 * 
	 * @param o The other version to compare to.
	 * @return Returns a negative integer, zero, or a positive integer as this
	 *         version update number is less than, equal to, or greater than the
	 *         specified version update number.
	 */
	public int compareUpdate(Version o) {
		return (update < o.update) ? -1 : ((update == o.update) ? 0 : 1);
	}

	@Override
	public int compareTo(Version o) {
		System.out.println("Utkarsh - I am inside compareTo in Version.java");
		int ret = compareBranch(o);

		if (ret == 0) {
			ret = compareUpdate(o);
		}

		return ret;
	}

	@Override
	public String toString() {
//		System.out.println("Utkarsh - I am inside toString of Verson.java");
	//	StringBuilder sb = new StringBuilder(3 + minors.length * 2 + (update > 0 ? 2 : 0)); // over approx. size
		StringBuilder sb = new StringBuilder(3 + minors.length * 2 + 2); // I will take 2 irrespective of update

		sb.append(major);
		// we'll always display at least one minor number; looks better that way
		if (minors.length == 0) {// should not happen if we ensure 4 digits from beginning
			//sb.append(MAJOR_MINOR_SEP).append("0");
			sb.append(MAJOR_MINOR_SEP).append("0").append("0");//make 4 digits

		} else {
			for (int i = 0; i < minors.length; i++) {
				sb.append(MAJOR_MINOR_SEP).append(minors[i]);
			}
			//Make 4 digits.
			if(minors.length ==1) {//add 0
				sb.append(MAJOR_MINOR_SEP).append("0");
			}
		}
		// update number will be skipped if zero
//		if (update > 0) {
//			sb.append(MINOR_UPDATE_SEP).append(update);
//		}
		//Not skipping updates even if 0
		sb.append(MINOR_PATCH_SEP).append(update);
		return sb.toString();
	}

	public static void main(String args[]) {
		Version v5 = new Version("1.6.2");
		Version v1 = new Version("1.6u3");
		Version v2 = new Version("1.6.0.3");
		Version v3 = new Version("1.6.3");
		Version v4 = new Version("1");	
		Version v6 = new Version("1.6.1.3");

System.out.println(v5.compareTo(v1));
		System.out.println(v5 + " " + v1 + " " + v2 + " " + v3 + " " + v4 + " " + v6);


		


	}
}