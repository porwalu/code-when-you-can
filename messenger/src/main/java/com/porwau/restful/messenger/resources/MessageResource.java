package com.porwau.restful.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.porwau.restful.messenger.model.Message;
import com.porwau.restful.messenger.service.MessageService;

@Path(value = "/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResource {
	private MessageService mServ = new MessageService();

	@GET
	public List<Message> getMessages(@QueryParam("year") int year, 
									@QueryParam("start") int start,
									@QueryParam("size") int size) {
		if (year != 0) {
			return mServ.getAllMessagesForAnYear(year);
		}
		if(start >= 0 && size > 0) {
			return mServ.getAllMessagesPaginated(start, size);
		}
		return mServ.getAllMessages();
	}

	@GET
	@Path(value = "/{messageID}")
	public Message getMsg(@PathParam(value = "messageID") long id) {
		return mServ.getMessage(id);
	}

	@POST
	public Message createMsg(Message message) {
		return mServ.createMessage(message);
	}

	@PUT
	@Path(value = "/{messageID}")
	public Message updateMsg(@PathParam(value = "messageID") long messageId, Message message) {
		message.setId(messageId);
		return mServ.updateMessage(messageId, message);
	}

	@DELETE
	@Path(value = "/{messageID}")
	public Message deleteMsg(@PathParam(value = "messageID") long messageId) {
		if (messageId < 0) {
			return null; // "Invalid messageID. Should be >=0";
		}
		return mServ.deleteMessage(messageId);
	}
}
