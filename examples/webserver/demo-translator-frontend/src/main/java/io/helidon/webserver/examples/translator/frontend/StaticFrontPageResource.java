/*
 * Copyright (c) 2017, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.helidon.webserver.examples.translator.frontend;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Pavel Bucek (pavel.bucek at oracle.com)
 */
@Path("/")
public class StaticFrontPageResource {

    /**
     * Static page get method.
     *
     * @return The page.
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    @SuppressWarnings("checkstyle:methodlength")
    public String get() {

        return "<?xml version=\"1.0\"?>\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:wadl=\"http://wadl.dev.java.net/2009/02\"\n"
                + "      xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" xmlns:html=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\"/>\n"
                + "    <style type=\"text/css\">\n"
                + "        body {\n"
                + "            font-family: sans-serif;\n"
                + "            font-size: 0.85em;\n"
                + "            margin: 2em 2em;\n"
                + "        }\n"
                + "\n"
                + "        .methods {\n"
                + "            margin-left: 2em;\n"
                + "            margin-bottom: 2em;\n"
                + "        }\n"
                + "\n"
                + "        .method {\n"
                + "            background-color: #eef;\n"
                + "            border: 1px solid #DDDDE6;\n"
                + "            padding: .5em;\n"
                + "            margin-bottom: 1em;\n"
                + "            width: 50em\n"
                + "        }\n"
                + "\n"
                + "        .methodNameTable {\n"
                + "            width: 100%;\n"
                + "            border: 0px;\n"
                + "            border-bottom: 2px solid white;\n"
                + "            font-size: 1.4em;\n"
                + "        }\n"
                + "\n"
                + "        .methodNameTd {\n"
                + "            background-color: #eef;\n"
                + "        }\n"
                + "\n"
                + "        h1 {\n"
                + "            font-size: 2 m;\n"
                + "            margin-bottom: 0em;\n"
                + "        }\n"
                + "\n"
                + "        h2 {\n"
                + "            border-bottom: 1px solid black;\n"
                + "            margin-top: 1.5em;\n"
                + "            margin-bottom: 0.5em;\n"
                + "            font-size: 1.5em;\n"
                + "        }\n"
                + "\n"
                + "        h3 {\n"
                + "            color: #FF6633;\n"
                + "            font-size: 1.35em;\n"
                + "            margin-top: .5em;\n"
                + "            margin-bottom: 0em;\n"
                + "        }\n"
                + "\n"
                + "        h5 {\n"
                + "            font-size: 1.2em;\n"
                + "            color: #99a;\n"
                + "            margin: 0.5em 0em 0.25em 0em;\n"
                + "        }\n"
                + "\n"
                + "        h6 {\n"
                + "            color: #700000;\n"
                + "            font-size: 1em;\n"
                + "            margin: 1em 0em 0em 0em;\n"
                + "        }\n"
                + "\n"
                + "        .h7 {\n"
                + "            margin-top: .75em;\n"
                + "            font-size: 1em;\n"
                + "            font-weight: bold;\n"
                + "            font-style: italic;\n"
                + "            color: blue;\n"
                + "        }\n"
                + "\n"
                + "        .h8 {\n"
                + "            margin-top: .75em;\n"
                + "            font-size: 1em;\n"
                + "            font-weight: bold;\n"
                + "            font-style: italic;\n"
                + "            color: black;\n"
                + "        }\n"
                + "\n"
                + "        tt {\n"
                + "            font-size: 1em;\n"
                + "        }\n"
                + "\n"
                + "        table {\n"
                + "            margin-bottom: 0.5em;\n"
                + "            border: 1px solid #E0E0E0;\n"
                + "        }\n"
                + "\n"
                + "        th {\n"
                + "            text-align: left;\n"
                + "            font-weight: normal;\n"
                + "            font-size: 1em;\n"
                + "            color: black;\n"
                + "            background-color: #DDDDE6;\n"
                + "            padding: 3px 6px;\n"
                + "            border: 1px solid #B1B1B8;\n"
                + "        }\n"
                + "\n"
                + "        td {\n"
                + "            padding: 3px 6px;\n"
                + "            vertical-align: top;\n"
                + "            background-color: #F6F6FF;\n"
                + "            font-size: 0.85em;\n"
                + "        }\n"
                + "\n"
                + "        p {\n"
                + "            margin-top: 0em;\n"
                + "            margin-bottom: 0em;\n"
                + "        }\n"
                + "\n"
                + "        td.summary {\n"
                + "            background-color: white;\n"
                + "        }\n"
                + "\n"
                + "        td.summarySeparator {\n"
                + "            padding: 1px;\n"
                + "        }\n"
                + "    </style>\n"
                + "    <title>\n"
                + "        Translator Frontend Service\n"
                + "    </title></head>\n"
                + "<body><h1>\n"
                + "    Translator Frontend Service\n"
                + "</h1><br/>\n"
                + "\n"
                + "<h2>Summary</h2>\n"
                + "<table>\n"
                + "    <tr>\n"
                + "        <th>Resource</th>\n"
                + "        <th>Method</th>\n"
                + "        <th>Description</th>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "        <td class=\"summary\"><a href=\"#idm31850526736\">./translator</a></td>\n"
                + "        <td class=\"summary\"><a href=\"#getText\">GET</a><br/><a "
                + "href=\"#post\">POST</a><br/></td>\n"
                + "        <td class=\"summary\"><br/><br/><br/></td>\n"
                + "    </tr>\n"
                + "</table>\n"
                + "<p/>\n"
                + "\n"
                + "<h2>Resources</h2><br/>\n"
                + "\n"
                + "<h3><a name=\"idm31850526736\">./translator</a></h3>\n"
                + "\n"
                + "<p/><h5>Methods</h5>\n"
                + "\n"
                + "<div class=\"methods\">\n"
                + "    <div class=\"method\">\n"
                + "        <table class=\"methodNameTable\">\n"
                + "            <tr>\n"
                + "                <td class=\"methodNameTd\" style=\"font-weight: bold\"><a "
                + "name=\"getText\">GET</a></td>\n"
                + "                <td class=\"methodNameTd\" style=\"text-align: right\">getText()\n"
                + "                </td>\n"
                + "            </tr>\n"
                + "        </table>\n"
                + "        <p/><h6>request</h6>\n"
                + "\n"
                + "        <div style=\"margin-left: 2em\">\n"
                + "            <div class=\"h7\">query params</div>\n"
                + "            <table>\n"
                + "                <tr>\n"
                + "                    <td style=\"font-weight: bold\">q</td>\n"
                + "                    <td><a href=\"http://www.w3.org/TR/xmlschema-2/#string\">string</a></td>\n"
                + "                </tr>\n"
                + "            </table>\n"
                + "            <p/></div>\n"
                + "        <h6>responses</h6>\n"
                + "\n"
                + "        <div style=\"margin-left: 2em\">\n"
                + "            <div class=\"h8\">status:</div>\n"
                + "            200 - OK\n"
                + "            <div style=\"margin-left: 2em\">\n"
                + "                <div class=\"h7\">representations</div>\n"
                + "                <table>\n"
                + "                    <tr>\n"
                + "                        <td style=\"font-weight: bold\">text/plain</td>\n"
                + "                        <td/>\n"
                + "                    </tr>\n"
                + "                </table>\n"
                + "            </div>\n"
                + "        </div>\n"
                + "    </div>\n"
                + "    <div class=\"method\">\n"
                + "        <table class=\"methodNameTable\">\n"
                + "            <tr>\n"
                + "                <td class=\"methodNameTd\" style=\"font-weight: bold\"><a "
                + "name=\"post\">POST</a></td>\n"
                + "                <td class=\"methodNameTd\" style=\"text-align: right\">post()\n"
                + "                </td>\n"
                + "            </tr>\n"
                + "        </table>\n"
                + "        <p/><h6>request</h6>\n"
                + "\n"
                + "        <div style=\"margin-left: 2em\">\n"
                + "            unspecified\n"
                + "        </div>\n"
                + "        <h6>responses</h6>\n"
                + "\n"
                + "        <div style=\"margin-left: 2em\">\n"
                + "            <div class=\"h8\">status:</div>\n"
                + "            200 - OK\n"
                + "            <div style=\"margin-left: 2em\">\n"
                + "                <div class=\"h7\">representations</div>\n"
                + "                <table>\n"
                + "                    <tr>\n"
                + "                        <td style=\"font-weight: bold\">text/plain</td>\n"
                + "                        <td/>\n"
                + "                    </tr>\n"
                + "                </table>\n"
                + "            </div>\n"
                + "        </div>\n"
                + "    </div>\n"
                + "</div>\n"
                + "</body>\n"
                + "</html>\n";
    }
}