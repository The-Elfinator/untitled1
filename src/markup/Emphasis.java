// Выделение. Копипасту убрать :)

package markup;

import java.util.List;

public class Emphasis extends AbstractMarker {

    public Emphasis(List<Markers> list) {
        super(list);
    }

    @Override
    public void toMarkdown(StringBuilder s) {
        super.toMarkdown(s, "*");
    }

    @Override
    public void toHtml(StringBuilder s) {
        super.toHtml(s, "em");
    }

}
