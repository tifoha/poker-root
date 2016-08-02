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
package com.cubeia.firebase.api.lobby;

import java.util.Map;

import com.cubeia.firebase.api.common.AttributeValue;

/**
 * This object is responsible for mapping a table to a set of 
 * attributes. It is used by the game lobby classes to transform
 * an object into serializable attributes values.
 * 
 * @author lars.j.nilsson
 */
public interface AttributeMapper<T> {
	
	/**
	 * This attribute is should be set to 'table' or 'mtt' whenever an 
	 * object is directly represented in the lobby. 
	 */
	// TODO: Move this constant to public system state interface
	public static final String NODE_TYPE_ATTRIBUTE_NAME = "_nodeType";

	
	/**
	 * This is the string value used as a 'hint' in the system state
	 * lobby to indicate that a node in the state tree is directly 
	 * representing a table object.
	 */
	public static final String TABLE_NODE_TYPE_ATTRIBUTE_VALUE = "table";
	
	
	/**
	 * This is the string value used as a 'hint' in the system state
	 * lobby to indicate that a node in the state tree is directly 
	 * representing a mtt object.
	 */
	public static final String MTT_NODE_TYPE_ATTRIBUTE_VALUE = "mtt";
	
	
	/**
	 * @param object Object to map attributes for, never null
	 * @return The object attributes, never null
	 */
	public Map<String, AttributeValue> toMap(T object);
	
}
