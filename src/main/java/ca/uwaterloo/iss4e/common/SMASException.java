package ca.uwaterloo.iss4e.common;

/**
 *
 *  Copyright (c) 2014 Xiufeng Liu ( xiufeng.liu@uwaterloo.ca )
 *
 *  This file is free software: you may copy, redistribute and/or modify it
 *  under the terms of the GNU General Public License version 2
 *  as published by the Free Software Foundation.
 *
 *  This file is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see http://www.gnu.org/licenses.
 */

public class SMASException extends Exception {
    public SMASException() {
        super();
    }
	public SMASException(String msg) {
		super(msg);
	}

	public SMASException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public SMASException(Throwable cause) {
		super(cause);
	}
}