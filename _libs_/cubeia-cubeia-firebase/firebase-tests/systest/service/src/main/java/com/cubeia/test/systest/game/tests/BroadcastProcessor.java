/**
 * Copyright (C) 2011 Cubeia Ltd <info@cubeia.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.cubeia.test.systest.game.tests;

import java.util.List;

import com.cubeia.firebase.api.action.Attribute;
import com.cubeia.firebase.api.action.service.ClientServiceAction;
import com.cubeia.firebase.api.service.ServiceContext;
import com.cubeia.firebase.api.service.ServiceRouter;
import com.cubeia.firebase.io.ProtocolObject;
import com.cubeia.test.systest.io.protocol.ServiceBroadcastRequestPacket;
import com.cubeia.test.systest.io.protocol.ServiceBroadcastResponsePacket;

public class BroadcastProcessor extends ProcessorBase {

	public void doTest(ServiceContext con, ServiceRouter router, ProtocolObject obj, List<Attribute> attributes) {
		ServiceBroadcastRequestPacket packet = (ServiceBroadcastRequestPacket)obj;
		ServiceBroadcastResponsePacket resp = new ServiceBroadcastResponsePacket(packet.payload);
		ClientServiceAction action = new ClientServiceAction(-1, -1, toBytes(resp));
		router.dispatchToPlayers(null, action);
	}
}
