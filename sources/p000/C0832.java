package p000;

import android.view.View;

/* JADX INFO: renamed from: ۥًٖؔؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0832 extends AbstractC5381 implements InterfaceC0882, InterfaceC0951, InterfaceC5671, InterfaceC0349 {

    /* JADX INFO: renamed from: ۥؔ */
    public InterfaceC2880 f2936;

    /* JADX INFO: renamed from: ۥً */
    public C2288 f2937;

    /* JADX INFO: renamed from: ۥ٘ */
    public C5704 f2939;

    /* JADX INFO: renamed from: ۥۤ */
    public C4207 f2942;

    /* JADX INFO: renamed from: ۦؒ */
    public C5559 f2944;

    /* JADX INFO: renamed from: ۦُ */
    public InterfaceC5188 f2948;

    /* JADX INFO: renamed from: ۦٖ */
    public View f2949;

    /* JADX INFO: renamed from: ۦٚ */
    public C5281 f2950;

    /* JADX INFO: renamed from: ۦۜ */
    public InterfaceC4808 f2951;

    /* JADX INFO: renamed from: ۥٕ */
    public float f2938 = Float.NaN;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f2941 = true;

    /* JADX INFO: renamed from: ۦؙ */
    public long f2947 = 9205357640488583168L;

    /* JADX INFO: renamed from: ۦؖ */
    public float f2945 = Float.NaN;

    /* JADX INFO: renamed from: ۥۦ */
    public float f2943 = Float.NaN;

    /* JADX INFO: renamed from: ۦؗ */
    public boolean f2946 = true;

    /* JADX INFO: renamed from: ۦۣ */
    public final C4852 f2952 = new C4852(null, C0373.f1364);

    /* JADX INFO: renamed from: ۥٛ */
    public long f2940 = 9205357640488583168L;

    public C0832(C2288 c2288, C5281 c5281, InterfaceC5188 interfaceC5188) {
        this.f2937 = c2288;
        this.f2950 = c5281;
        this.f2948 = interfaceC5188;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        mo772();
        this.f2944 = AbstractC1631.m3405(0, 0, 7);
        AbstractC2765.m5135(m9076(), null, 4, new C2718(this, (InterfaceC0443) null, 7), 1);
    }

    /* JADX INFO: renamed from: ۥؐ */
    public final void m1723() {
        InterfaceC2880 interfaceC2880;
        InterfaceC4808 interfaceC4808 = this.f2951;
        if (interfaceC4808 == null || (interfaceC2880 = this.f2936) == null) {
            return;
        }
        C5898 c5898 = (C5898) interfaceC4808;
        long jM9724 = c5898.m9724();
        C4207 c4207 = this.f2942;
        if (c4207 != null && jM9724 == c4207.f13969) {
            return;
        }
        C5281 c5281 = this.f2950;
        if (c5281 != null) {
            c5281.mo211(new C1495(interfaceC2880.mo752(AbstractC5537.m9235(c5898.m9724()))));
        }
        this.f2942 = new C4207(c5898.m9724());
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final long m1724() {
        C5704 c5704M5600 = this.f2939;
        if (c5704M5600 == null) {
            c5704M5600 = AbstractC3004.m5600(new C4287(this, 2));
            this.f2939 = c5704M5600;
        }
        return ((C1553) c5704M5600.getValue()).f5241;
    }

    /* JADX INFO: renamed from: ۥؒ */
    public final void m1725() {
        InterfaceC2880 interfaceC2880 = this.f2936;
        if (interfaceC2880 == null) {
            interfaceC2880 = AbstractC5537.m9270(this).f2236;
            this.f2936 = interfaceC2880;
        }
        long j = ((C1553) this.f2937.mo211(interfaceC2880)).f5241;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & m1724()) == 9205357640488583168L) {
            this.f2940 = 9205357640488583168L;
            InterfaceC4808 interfaceC4808 = this.f2951;
            if (interfaceC4808 != null) {
                ((C5898) interfaceC4808).m9725();
                return;
            }
            return;
        }
        this.f2940 = C1553.m3304(m1724(), j);
        if (this.f2951 == null) {
            m1727();
        }
        InterfaceC4808 interfaceC4809 = this.f2951;
        if (interfaceC4809 != null) {
            interfaceC4809.mo7364(this.f2940, 9205357640488583168L, this.f2938);
        }
        m1723();
    }

    @Override // p000.InterfaceC0951
    /* JADX INFO: renamed from: ۥٛ */
    public final void mo1726(C2497 c2497) {
        c2497.m4644();
        C5559 c5559 = this.f2944;
        if (c5559 != null) {
            c5559.mo5597(C2358.f7817);
        }
    }

    /* JADX INFO: renamed from: ۥٜ */
    public final void m1727() {
        InterfaceC4808 interfaceC4808 = this.f2951;
        if (interfaceC4808 != null) {
            ((C5898) interfaceC4808).m9725();
        }
        View viewM7803 = this.f2949;
        if (viewM7803 == null) {
            viewM7803 = AbstractC4489.m7803(this);
        }
        View view = viewM7803;
        this.f2949 = view;
        InterfaceC2880 interfaceC2880 = this.f2936;
        if (interfaceC2880 == null) {
            interfaceC2880 = AbstractC5537.m9270(this).f2236;
        }
        InterfaceC2880 interfaceC2881 = interfaceC2880;
        this.f2936 = interfaceC2881;
        this.f2951 = this.f2948.mo3262(view, this.f2941, this.f2947, this.f2945, this.f2943, this.f2946, interfaceC2881, this.f2938);
        m1723();
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        InterfaceC4808 interfaceC4808 = this.f2951;
        if (interfaceC4808 != null) {
            ((C5898) interfaceC4808).m9725();
        }
        this.f2951 = null;
    }

    @Override // p000.InterfaceC0349
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo772() {
        AbstractC5568.m9359(this, new C4287(this, 0));
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦٟ */
    public final void mo790(InterfaceC1066 interfaceC1066) {
        interfaceC1066.mo2266(AbstractC4533.f14985, new C4287(this, 1));
    }

    @Override // p000.InterfaceC0882
    /* JADX INFO: renamed from: ۦۛ */
    public final void mo1728(AbstractC1311 abstractC1311) {
        this.f2952.setValue(abstractC1311);
    }
}
