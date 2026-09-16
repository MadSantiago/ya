package p000;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥؒ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C0004 {

    /* JADX INFO: renamed from: ۥْ */
    public static final View.AccessibilityDelegate f868 = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: ۦ۟ */
    public final C0030 f869;

    /* JADX INFO: renamed from: ۦۨ */
    public final View.AccessibilityDelegate f870;

    public C0004(View.AccessibilityDelegate accessibilityDelegate) {
        this.f870 = accessibilityDelegate;
        this.f869 = new C0030(this);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void mo488(View view, C5817 c5817) {
        this.f870.onInitializeAccessibilityNodeInfo(view, c5817.f19154);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void mo489(View view, AccessibilityEvent accessibilityEvent) {
        this.f870.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public C4228 mo490(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f870.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C4228(3, accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public boolean mo491(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        for (int i2 = 0; i2 < list.size() && ((C5464) list.get(i2)).m9152() != i; i2++) {
        }
        boolean zPerformAccessibilityAction = this.f870.performAccessibilityAction(view, i, bundle);
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public C0004() {
        this(f868);
    }
}
