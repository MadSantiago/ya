package p000;

import android.os.Looper;

/* JADX INFO: renamed from: ۦ٘ؔؑٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4423 extends AbstractC4351 {

    /* JADX INFO: renamed from: ۥَ */
    public final C3743 f14590;

    /* JADX INFO: renamed from: ۥْ */
    public HandlerC0645 f14591;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f14592;

    /* JADX INFO: renamed from: ۥٖ */
    public final C0616 f14593;

    /* JADX INFO: renamed from: ۦٗ */
    public final C4898 f14594;

    public C4423(C5371 c5371) {
        super(c5371);
        this.f14592 = true;
        this.f14590 = new C3743(5, this);
        this.f14593 = new C0616(this);
        C4898 c4898 = new C4898();
        c4898.f16142 = this;
        this.f14594 = c4898;
    }

    @Override // p000.AbstractC4351
    /* JADX INFO: renamed from: ۥٖ */
    public final boolean mo3853() {
        return false;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m7719() {
        mo6517();
        if (this.f14591 == null) {
            this.f14591 = new HandlerC0645(Looper.getMainLooper(), 2);
        }
    }
}
