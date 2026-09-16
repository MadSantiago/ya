package p000;

/* JADX INFO: renamed from: ۦ۠ؔ۠ؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5399 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC4434 f17835;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f17836;

    /* JADX INFO: renamed from: ۥّ */
    public final int f17837;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3564 f17838;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f17839;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f17840;

    /* JADX INFO: renamed from: ۦۙ */
    public final int f17841;

    public C5399(String str, C3564 c3564, InterfaceC4434 interfaceC4434, int i, boolean z, int i2, int i3) {
        this.f17839 = str;
        this.f17838 = c3564;
        this.f17835 = interfaceC4434;
        this.f17840 = i;
        this.f17836 = z;
        this.f17837 = i2;
        this.f17841 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5399)) {
            return false;
        }
        C5399 c5399 = (C5399) obj;
        return AbstractC3831.m6874(this.f17839, c5399.f17839) && AbstractC3831.m6874(this.f17838, c5399.f17838) && AbstractC3831.m6874(this.f17835, c5399.f17835) && this.f17840 == c5399.f17840 && this.f17836 == c5399.f17836 && this.f17837 == c5399.f17837 && this.f17841 == c5399.f17841;
    }

    public final int hashCode() {
        return (((AbstractC5078.m8672(AbstractC2049.m3999(this.f17840, (this.f17835.hashCode() + AbstractC5078.m8668(this.f17838, this.f17839.hashCode() * 31, 31)) * 31, 31), 31, this.f17836) + this.f17837) * 31) + this.f17841) * 31;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        InterfaceC4434 interfaceC4434;
        InterfaceC4434 interfaceC4435;
        int i5;
        int i6;
        C2210 c2210 = (C2210) abstractC5381;
        c2210.getClass();
        C3564 c3564 = c2210.f7328;
        boolean z5 = false;
        boolean z6 = true;
        C3564 c3565 = this.f17838;
        if (c3565 != c3564) {
            if (!c3565.f11803.m1243(c3564.f11803)) {
                z = true;
            }
            str = c2210.f7319;
            str2 = this.f17839;
            if (!AbstractC3831.m6874(str, str2)) {
                c2210.f7319 = str2;
                c2210.f7318 = null;
                z5 = true;
            }
            z2 = !c2210.f7328.m6358(c3565);
            c2210.f7328 = c3565;
            i = c2210.f7322;
            i2 = this.f17841;
            if (i != i2) {
                c2210.f7322 = i2;
                z2 = true;
            }
            i3 = c2210.f7323;
            i4 = this.f17837;
            if (i3 != i4) {
                c2210.f7323 = i4;
                z2 = true;
            }
            z3 = c2210.f7325;
            z4 = this.f17836;
            if (z3 != z4) {
                c2210.f7325 = z4;
                z2 = true;
            }
            interfaceC4434 = c2210.f7320;
            interfaceC4435 = this.f17835;
            if (!AbstractC3831.m6874(interfaceC4434, interfaceC4435)) {
                c2210.f7320 = interfaceC4435;
                z2 = true;
            }
            i5 = c2210.f7321;
            i6 = this.f17840;
            if (i5 == i6) {
                z6 = z2;
            } else {
                c2210.f7321 = i6;
            }
            if (z5 || z6) {
                C0216 c0216M4273 = c2210.m4273();
                String str3 = c2210.f7319;
                C3564 c3566 = c2210.f7328;
                InterfaceC4434 interfaceC4436 = c2210.f7320;
                int i7 = c2210.f7321;
                boolean z7 = c2210.f7325;
                int i8 = c2210.f7323;
                int i9 = c2210.f7322;
                c0216M4273.f809 = str3;
                c0216M4273.f807 = c3566;
                c0216M4273.f801 = interfaceC4436;
                c0216M4273.f810 = i7;
                c0216M4273.f803 = z7;
                c0216M4273.f804 = i8;
                c0216M4273.f816 = i9;
                c0216M4273.f802 = (c0216M4273.f802 << 2) | 2;
                c0216M4273.m469();
            }
            if (c2210.f17786) {
                if (z5 || (z && c2210.f7327 != null)) {
                    AbstractC0186.m412(c2210);
                }
                if (z5 || z6) {
                    C5063.m8642(c2210);
                    AbstractC5378.m9047(c2210);
                }
                if (z) {
                    AbstractC5378.m9047(c2210);
                }
            }
            return;
        }
        c3565.getClass();
        z = false;
        str = c2210.f7319;
        str2 = this.f17839;
        if (!AbstractC3831.m6874(str, str2)) {
            c2210.f7319 = str2;
            c2210.f7318 = null;
            z5 = true;
        }
        z2 = !c2210.f7328.m6358(c3565);
        c2210.f7328 = c3565;
        i = c2210.f7322;
        i2 = this.f17841;
        if (i != i2) {
            c2210.f7322 = i2;
            z2 = true;
        }
        i3 = c2210.f7323;
        i4 = this.f17837;
        if (i3 != i4) {
            c2210.f7323 = i4;
            z2 = true;
        }
        z3 = c2210.f7325;
        z4 = this.f17836;
        if (z3 != z4) {
            c2210.f7325 = z4;
            z2 = true;
        }
        interfaceC4434 = c2210.f7320;
        interfaceC4435 = this.f17835;
        if (!AbstractC3831.m6874(interfaceC4434, interfaceC4435)) {
            c2210.f7320 = interfaceC4435;
            z2 = true;
        }
        i5 = c2210.f7321;
        i6 = this.f17840;
        if (i5 == i6) {
            z6 = z2;
        } else {
            c2210.f7321 = i6;
        }
        if (z5) {
            C0216 c0216M4274 = c2210.m4273();
            String str4 = c2210.f7319;
            C3564 c3567 = c2210.f7328;
            InterfaceC4434 interfaceC4437 = c2210.f7320;
            int i10 = c2210.f7321;
            boolean z8 = c2210.f7325;
            int i11 = c2210.f7323;
            int i12 = c2210.f7322;
            c0216M4274.f809 = str4;
            c0216M4274.f807 = c3567;
            c0216M4274.f801 = interfaceC4437;
            c0216M4274.f810 = i10;
            c0216M4274.f803 = z8;
            c0216M4274.f804 = i11;
            c0216M4274.f816 = i12;
            c0216M4274.f802 = (c0216M4274.f802 << 2) | 2;
            c0216M4274.m469();
        } else {
            C0216 c0216M4275 = c2210.m4273();
            String str5 = c2210.f7319;
            C3564 c3568 = c2210.f7328;
            InterfaceC4434 interfaceC4438 = c2210.f7320;
            int i13 = c2210.f7321;
            boolean z9 = c2210.f7325;
            int i14 = c2210.f7323;
            int i15 = c2210.f7322;
            c0216M4275.f809 = str5;
            c0216M4275.f807 = c3568;
            c0216M4275.f801 = interfaceC4438;
            c0216M4275.f810 = i13;
            c0216M4275.f803 = z9;
            c0216M4275.f804 = i14;
            c0216M4275.f816 = i15;
            c0216M4275.f802 = (c0216M4275.f802 << 2) | 2;
            c0216M4275.m469();
        }
        if (c2210.f17786) {
            return;
        }
        if (z5) {
            AbstractC0186.m412(c2210);
        } else {
            AbstractC0186.m412(c2210);
        }
        if (z5) {
            C5063.m8642(c2210);
            AbstractC5378.m9047(c2210);
        } else {
            C5063.m8642(c2210);
            AbstractC5378.m9047(c2210);
        }
        if (z) {
            AbstractC5378.m9047(c2210);
        }
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C2210 c2210 = new C2210();
        c2210.f7319 = this.f17839;
        c2210.f7328 = this.f17838;
        c2210.f7320 = this.f17835;
        c2210.f7321 = this.f17840;
        c2210.f7325 = this.f17836;
        c2210.f7323 = this.f17837;
        c2210.f7322 = this.f17841;
        return c2210;
    }
}
