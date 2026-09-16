package p000;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: ۥٖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2348 {
    /* JADX INFO: renamed from: ۥۗ */
    public static boolean m4420(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC2142 c5086;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c5086 = new C5086(clipData, 3);
        } else {
            C0384 c0384 = new C0384(0);
            c0384.f1432 = clipData;
            c0384.f1429 = 3;
            c5086 = c0384;
        }
        AbstractC3608.m6431(view, c5086.build());
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static boolean m4421(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC2142 c5086;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c5086 = new C5086(clipData, 3);
            } else {
                C0384 c0384 = new C0384(0);
                c0384.f1432 = clipData;
                c0384.f1429 = 3;
                c5086 = c0384;
            }
            AbstractC3608.m6431(textView, c5086.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }
}
