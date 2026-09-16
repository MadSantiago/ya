package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥْٜؗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1849 extends AbstractC5381 implements InterfaceC0289, InterfaceC2766, InterfaceC4825 {

    /* JADX INFO: renamed from: ۥً */
    public C4508 f6134;

    /* JADX INFO: renamed from: ۥٕ */
    public boolean f6135;

    /* JADX INFO: renamed from: ۦٚ */
    public C4885 f6136;

    public AbstractC1849(C4885 c4885, C4508 c4508) {
        this.f6134 = c4508;
        this.f6136 = c4885;
    }

    /* JADX INFO: renamed from: ۥؐ */
    public abstract boolean mo3632(int i);

    /* JADX INFO: renamed from: ۥؑ */
    public final void m3633() {
        C4885 c4885;
        C5450 c5450 = new C5450();
        AbstractC5378.m9057(this, new C3948(c5450));
        AbstractC1849 abstractC1849 = (AbstractC1849) c5450.f17965;
        if (abstractC1849 == null || (c4885 = abstractC1849.f6136) == null) {
            c4885 = this.f6136;
        }
        mo3635(c4885);
    }

    /* JADX INFO: renamed from: ۥؒ */
    public final void m3634() {
        C5662 c5662 = new C5662();
        c5662.f18631 = true;
        AbstractC5378.m9064(this, new C3428(c5662));
        if (c5662.f18631) {
            m3633();
        }
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۥَ */
    public final long mo2391() {
        if (this.f6134 == null) {
            return AbstractC3676.f12282;
        }
        InterfaceC2880 interfaceC2880 = AbstractC5537.m9270(this).f2236;
        int i = AbstractC3676.f12281;
        return AbstractC4225.m7458(interfaceC2880.mo743(10.0f), interfaceC2880.mo743(40.0f), interfaceC2880.mo743(10.0f), interfaceC2880.mo743(40.0f));
    }

    /* JADX INFO: renamed from: ۥٜ */
    public abstract void mo3635(InterfaceC3737 interfaceC3737);

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؓ */
    public final void mo783() {
        m3636();
    }

    /* JADX INFO: renamed from: ۦؕ */
    public final void m3636() {
        if (this.f6135) {
            this.f6135 = false;
            if (this.f17786) {
                C5450 c5450 = new C5450();
                AbstractC5378.m9057(this, new C0302(c5450, 1));
                AbstractC1849 abstractC1849 = (AbstractC1849) c5450.f17965;
                if (abstractC1849 != null) {
                    abstractC1849.m3633();
                } else {
                    mo3635(null);
                }
            }
        }
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؗ */
    public final void mo785(C5639 c5639, EnumC3834 enumC3834, long j) {
        if (enumC3834 == EnumC3834.f12724) {
            List list = c5639.f18583;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (mo3632(((C3536) list.get(i)).f11737)) {
                    int i2 = c5639.f18581;
                    if (i2 == 4) {
                        this.f6135 = true;
                        m3634();
                        return;
                    } else {
                        if (i2 == 5) {
                            m3636();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        m3636();
    }
}
