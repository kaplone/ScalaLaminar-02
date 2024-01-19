import com.raquo.laminar.api.L._
import org.scalajs.dom

object ScalaLaminar_02 {
  def main(args: Array[String]): Unit = {

    val appContainer: dom.Element = dom.document.querySelector("#appContainer")

    val s1_14 = ElementFactory.getCheckBox("Factory")
    val s1_15 = ElementBuilder.CheckBoxBuilder()
      .withLabel("Builder")
      .build()

    val s1_16 = ElementBuilder.CheckBoxBuilder()
      .build()

    val appElement: Div = div(
      div(
      h1("_"),
      "Current time is:",
      b("12:00")),
      div(button(" | Button | ", cls := "button-3", role := "button"),
      div(input("--> input ")),
        s1_14,
        s1_15,
        s1_16
        )
    )

    // this is how you render the appElement in the browser
    render(appContainer, appElement)
  }

}


// 1) Run "fastOptJS" in sbt console to build js file
// 2) open index.html