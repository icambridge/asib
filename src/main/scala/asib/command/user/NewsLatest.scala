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

package asib.command.user

import com.gu.openplatform.contentapi.Api
import asib.Asib

class NewsLatest extends AbstractUserCommand {

	val helpMessage = "Boom boom"

	def execute(username: String, channel: String, args: String) = {

		val latestItems = Api.search.pageSize(5).response

		latestItems.results.foreach { item =>

			Asib.sendNotice(username, item.webTitle + " - " + item.webUrl)

		}

	}

}