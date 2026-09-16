package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: ۥؑ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0003 extends ClickableSpan {

    /* JADX INFO: renamed from: ۥْ */
    public final int f623;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5817 f624;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f625;

    public C0003(int i, C5817 c5817, int i2) {
        this.f625 = i;
        this.f624 = c5817;
        this.f623 = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f625);
        this.f624.f19154.performAction(this.f623, bundle);
    }
}
