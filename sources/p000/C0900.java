package p000;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: ۥٌٍِؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0900 extends FrameLayout implements InterfaceC0595 {

    /* JADX INFO: renamed from: ۦۨ */
    public final CollapsibleActionView f3240;

    /* JADX WARN: Multi-variable type inference failed */
    public C0900(View view) {
        super(view.getContext());
        this.f3240 = (CollapsibleActionView) view;
        addView(view);
    }
}
