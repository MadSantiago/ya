package p000;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;

/* JADX INFO: renamed from: ۥۘؑٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2139 extends C3755 {

    /* JADX INFO: renamed from: ۦۛ */
    public boolean f7017;

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getSelectionStart() < 0 || getSelectionEnd() < 0) {
            CharSequence text = getText();
            Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
            if (spannable != null) {
                Selection.setSelection(spannable, spannable.length());
            }
        } else if (getSelectionStart() != getSelectionEnd() && motionEvent != null && motionEvent.getActionMasked() == 0) {
            CharSequence text2 = getText();
            setText((CharSequence) null);
            setText(text2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.performClick();
        if (this.f7017) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - getTotalPaddingLeft();
            int totalPaddingTop = y - getTotalPaddingTop();
            int scrollX = getScrollX() + totalPaddingLeft;
            int scrollY = getScrollY() + totalPaddingTop;
            Layout layout = getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spannable) getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (!(clickableSpanArr.length == 0)) {
                if (motionEvent.getAction() == 1) {
                    clickableSpanArr[0].onClick(this);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z) {
        super.setTextIsSelectable(z);
        this.f7017 = z;
    }
}
