package p000;

/* JADX INFO: renamed from: ۦٜٕؖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4702 extends AbstractC5381 implements InterfaceC0289 {

    /* JADX INFO: renamed from: ۥً */
    public InterfaceC4686 f15510;

    /* JADX INFO: renamed from: ۦٚ */
    public InterfaceC4686 f15511;

    public AbstractC4702() {
        C4234 c4234 = AbstractC4225.f14016;
        this.f15510 = c4234;
        this.f15511 = c4234;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public void mo780() {
        AbstractC5378.m9053(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C5567(this, 1));
        mo8045();
    }

    /* JADX INFO: renamed from: ۥؑ */
    public abstract InterfaceC4686 mo2269(InterfaceC4686 interfaceC4686);

    @Override // p000.InterfaceC0289
    /* JADX INFO: renamed from: ۥٓ */
    public final Object mo612() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    /* JADX INFO: renamed from: ۥٜ */
    public void mo8045() {
        this.f15511 = mo2269(this.f15510);
        AbstractC5378.m9061(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C5567(this, 0));
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦً */
    public final void mo1267() {
        this.f15510 = AbstractC4225.f14016;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public void mo788() {
        this.f15511 = this.f15510;
        AbstractC5378.m9061(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C5567(this, 0));
    }
}
