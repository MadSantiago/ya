package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import p000.AbstractC1434;
import p000.AbstractC4593;
import p000.AbstractC5078;
import p000.C0968;
import p000.C1078;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC4593 {

    /* JADX INFO: renamed from: ۦؚ */
    public boolean f229 = false;

    /* JADX INFO: renamed from: ۦِ */
    public final AbstractC1434 f230;

    /* JADX INFO: renamed from: ۦٛ */
    public final int f231;

    /* JADX INFO: renamed from: ۦۗ */
    public final boolean f232;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f231 = 1;
        this.f232 = false;
        C0968 c0968M7970 = AbstractC4593.m7970(context, attributeSet, i, i2);
        int i3 = c0968M7970.f3420;
        if (i3 != 0 && i3 != 1) {
            C1078.m2272(AbstractC5078.m8670(i3, "invalid orientation:"));
            throw null;
        }
        if (i3 != this.f231 || this.f230 == null) {
            this.f230 = AbstractC1434.m3063(this, i3);
            this.f231 = i3;
        }
        boolean z = c0968M7970.f3418;
        if (z != this.f232) {
            this.f232 = z;
        }
        mo81(c0968M7970.f3421);
    }

    /* JADX INFO: renamed from: ۦؖ */
    public void mo81(boolean z) {
        if (this.f229 == z) {
            return;
        }
        this.f229 = z;
    }
}
