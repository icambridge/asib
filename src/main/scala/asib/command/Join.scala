/*
	ASIB - A Scala IRC Bot
    Copyright (C) 2012  Iain Cambridge

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package asib.command

import asib.Asib
import asib.command.join.AbstractJoinCommand
import asib.util.Message

class Join extends AbstractCommand {

	proccessCommands("joins")

	def handle(message: Message) = {

		for ((commandName, commandObject: AbstractJoinCommand) <- userCommands) {
			commandObject.join(message.username, message.channel)
		}
	}

}