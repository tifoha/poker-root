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
package com.cubeia.test.loadtest.game;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class LoadData implements Serializable {
	
	private static final long serialVersionUID = -7490153724019414312L;

	private static final int MINIMUM_PAYLOAD = 1024 * 5;
	
	byte[] payload = new byte[MINIMUM_PAYLOAD];
	Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
	
}
