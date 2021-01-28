package ocp

class Local : Network {

    override fun callSaveProcess(content: String) {
        println("service call $content")
    }
}