package p000;

/* JADX INFO: renamed from: ۥٌَٜؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1809 extends AbstractC2164 {

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ int f6022;

    /* JADX INFO: renamed from: ۦِ */
    public int f6023;

    /* JADX INFO: renamed from: ۦٛ */
    public boolean f6024;

    /* JADX INFO: renamed from: ۦۗ */
    public final /* synthetic */ Object f6025;

    public C1809(C4799 c4799) {
        this.f6022 = 1;
        this.f6025 = c4799;
        this.f6024 = false;
        this.f6023 = 0;
    }

    @Override // p000.AbstractC2164, p000.InterfaceC1953
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3065() {
        int i = this.f6022;
        Object obj = this.f6025;
        switch (i) {
            case 0:
                ((C0251) obj).f930.setVisibility(0);
                break;
            default:
                if (!this.f6024) {
                    this.f6024 = true;
                    InterfaceC1953 interfaceC1953 = ((C4799) obj).f15835;
                    if (interfaceC1953 != null) {
                        interfaceC1953.mo3065();
                    }
                    break;
                }
                break;
        }
    }

    @Override // p000.AbstractC2164, p000.InterfaceC1953
    /* JADX INFO: renamed from: ۥۗ */
    public void mo3066() {
        switch (this.f6022) {
            case 0:
                this.f6024 = true;
                break;
        }
    }

    @Override // p000.InterfaceC1953
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo526() {
        int i = this.f6022;
        Object obj = this.f6025;
        switch (i) {
            case 0:
                if (!this.f6024) {
                    ((C0251) obj).f930.setVisibility(this.f6023);
                }
                break;
            default:
                int i2 = this.f6023 + 1;
                this.f6023 = i2;
                C4799 c4799 = (C4799) obj;
                if (i2 == c4799.f15834.size()) {
                    InterfaceC1953 interfaceC1953 = c4799.f15835;
                    if (interfaceC1953 != null) {
                        interfaceC1953.mo526();
                    }
                    this.f6023 = 0;
                    this.f6024 = false;
                    c4799.f15831 = false;
                }
                break;
        }
    }

    public C1809(C0251 c0251, int i) {
        this.f6022 = 0;
        this.f6025 = c0251;
        this.f6023 = i;
        this.f6024 = false;
    }
}
