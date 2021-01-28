package ocp

import java.net.URI

class HttpNetwork : Network {
    private val uri = URI("hhtp://bcp.com")

    override fun callSaveProcess(content: String) {
        print("this is the content : $content and this is the uri $uri")
    }
}