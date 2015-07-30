/*
 *     Copyright (C) 2015  higherfrequencytrading.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.openhft.lang.io;

public final class NullByteCountListener implements ByteCountListener {
	private static final NullByteCountListener INSTANCE = new NullByteCountListener();

	private NullByteCountListener() {
		// to be constructed only from inside of the class
	}

	@Override
	public void bytesProcessed(long byteCount) {
		// do nothing
	}

	public static ByteCountListener getInstance() {
		return INSTANCE;
	}
}