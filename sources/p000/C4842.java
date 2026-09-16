package p000;

import android.content.Context;

/* JADX INFO: renamed from: ۦٟؒٚٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4842 extends AbstractC0054 {

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f15946;

    /* JADX INFO: renamed from: ۦٕ */
    public final C4852 f15947;

    public C4842(Context context) {
        super(context);
        this.f15947 = AbstractC2774.m5183(AbstractC2987.f10044);
    }

    @Override // p000.AbstractC0054
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f15946;
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1384(int i, C5362 c5362) {
        c5362.m8979(576708319);
        int i2 = (c5362.m8977(this) ? 4 : 2) | i;
        if (c5362.m9011(i2 & 1, (i2 & 3) != 2)) {
            ((InterfaceC5731) this.f15947.getValue()).mo219(c5362, 0);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4164(i, 12, this);
        }
    }
}
