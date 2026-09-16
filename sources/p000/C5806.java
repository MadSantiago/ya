package p000;

/* JADX INFO: renamed from: ۦٟۧؑٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C5806 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0215 f19130;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f19131;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2243 f19132;

    public C5806(C2243 c2243, boolean z, C0969 c0969) {
        this.f19132 = c2243;
        this.f19131 = z;
        this.f19130 = c0969;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5806)) {
            return false;
        }
        C5806 c5806 = (C5806) obj;
        return AbstractC3831.m6874(this.f19132, c5806.f19132) && this.f19131 == c5806.f19131 && AbstractC3831.m6874(this.f19130, c5806.f19130);
    }

    public final int hashCode() {
        return this.f19130.hashCode() + AbstractC5078.m8672(this.f19132.hashCode() * 31, 31, this.f19131);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f19132 + ", checked=" + this.f19131 + ", animationSpec=" + this.f19130 + ')';
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C2424 c2424 = (C2424) abstractC5381;
        c2424.f8078 = this.f19132;
        boolean z = c2424.f8085;
        boolean z2 = this.f19131;
        if (z != z2) {
            C5063.m8642(c2424);
        }
        c2424.f8085 = z2;
        c2424.f8079 = this.f19130;
        if (c2424.f8082 == null && !Float.isNaN(c2424.f8083)) {
            c2424.f8082 = AbstractC4554.m7908(c2424.f8083);
        }
        if (c2424.f8084 != null || Float.isNaN(c2424.f8081)) {
            return;
        }
        c2424.f8084 = AbstractC4554.m7908(c2424.f8081);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C2424 c2424 = new C2424();
        c2424.f8078 = this.f19132;
        c2424.f8085 = this.f19131;
        c2424.f8079 = this.f19130;
        c2424.f8081 = Float.NaN;
        c2424.f8083 = Float.NaN;
        return c2424;
    }
}
