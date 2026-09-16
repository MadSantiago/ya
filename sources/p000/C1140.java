package p000;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: ۥّٕؑؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1140 extends C3682 {
    @Override // p000.AbstractC1481
    /* JADX INFO: renamed from: ۥۗ */
    public boolean mo2399(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    @Override // p000.C3682, p000.AbstractC1481
    /* JADX INFO: renamed from: ۥۣ */
    public void mo2400(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }
}
