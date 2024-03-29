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

    // hold the value
    val titleVar: Var[String] = Var("Some title here")

    val appElement: Div = div(

      // expose the value
      h1(child.text <-- titleVar.signal),

      div(input(
        placeholder := "Write a title",
        // update the value
        inContext(s => onInput.map(_ => s.ref.value) --> titleVar)
      )),

      div(button(" | Button | ", cls := "button-3", role := "button"),
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