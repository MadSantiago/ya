package p000;

/* JADX INFO: renamed from: ۥٍؚؔٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0777 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f2808;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0777 f2811;

    /* JADX INFO: renamed from: ۥۜ */
    public final C4852 f2812;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5208 f2813;

    /* JADX INFO: renamed from: ۦِ */
    public final C1347 f2815;

    /* JADX INFO: renamed from: ۦٛ */
    public final C1347 f2816;

    /* JADX INFO: renamed from: ۦۗ */
    public final C4852 f2817;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4852 f2814 = AbstractC2774.m5183(m1671());

    /* JADX INFO: renamed from: ۥُ */
    public final C4852 f2809 = AbstractC2774.m5183(new C2451(m1671(), m1671()));

    /* JADX INFO: renamed from: ۥّ */
    public final C0925 f2810 = new C0925(0);

    /* JADX INFO: renamed from: ۦۙ */
    public final C0925 f2818 = new C0925(Long.MIN_VALUE);

    public C0777(C5208 c5208, C0777 c0777, String str) {
        this.f2813 = c5208;
        this.f2811 = c0777;
        this.f2808 = str;
        Boolean bool = Boolean.FALSE;
        this.f2812 = AbstractC2774.m5183(bool);
        this.f2816 = new C1347();
        this.f2815 = new C1347();
        this.f2817 = AbstractC2774.m5183(bool);
        AbstractC3004.m5600(new C3169(this, 1));
    }

    public final String toString() {
        C1347 c1347 = this.f2816;
        int size = c1347.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((C3051) c1347.get(i)) + ", ";
        }
        return str;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Object m1671() {
        return this.f2813.f17213.getValue();
    }

    /* JADX INFO: renamed from: ۥُ */
    public final long m1672() {
        C0777 c0777 = this.f2811;
        return c0777 != null ? c0777.m1672() : this.f2810.m1901();
    }

    /* JADX INFO: renamed from: ۥّ */
    public final C2451 m1673() {
        return (C2451) this.f2809.getValue();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final long m1674() {
        C1347 c1347 = this.f2816;
        int size = c1347.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((C3051) c1347.get(i)).f10273.m1901());
        }
        C1347 c1348 = this.f2815;
        int size2 = c1348.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((C0777) c1348.get(i2)).m1674());
        }
        return jMax;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m1675(long j, boolean z) {
        C5208 c5208 = this.f2813;
        C4852 c4852 = c5208.f17214;
        C0925 c0925 = this.f2818;
        if (c0925.m1901() == Long.MIN_VALUE) {
            c0925.m1900(j);
            c5208.f17214.setValue(Boolean.TRUE);
        } else if (!((Boolean) c4852.getValue()).booleanValue()) {
            c4852.setValue(Boolean.TRUE);
        }
        this.f2812.setValue(Boolean.FALSE);
        C1347 c1347 = this.f2816;
        int size = c1347.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            C3051 c3051 = (C3051) c1347.get(i);
            C4852 c4853 = c3051.f10267;
            C4852 c4854 = c3051.f10267;
            if (!((Boolean) c4853.getValue()).booleanValue()) {
                long jMo2834 = z ? c3051.m5656().mo2834() : j;
                c3051.f10275.setValue(c3051.m5656().mo2837(jMo2834));
                c3051.f10272 = c3051.m5656().mo2836(jMo2834);
                if (c3051.m5656().m7629(jMo2834)) {
                    c4854.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c4854.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        C1347 c1348 = this.f2815;
        int size2 = c1348.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0777 c0777 = (C0777) c1348.get(i2);
            if (!AbstractC3831.m6874(c0777.f2814.getValue(), c0777.m1671())) {
                c0777.m1675(j, z);
            }
            if (!AbstractC3831.m6874(c0777.f2814.getValue(), c0777.m1671())) {
                z2 = false;
            }
        }
        if (z2) {
            m1679();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m1676(Object obj, C5362 c5362, int i) {
        int i2;
        c5362.m8979(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c5362.m8963(obj) : c5362.m8977(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8963(this) ? 32 : 16;
        }
        int i3 = 0;
        if (!c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            c5362.m8982();
        } else if (m1681()) {
            c5362.m8957(467722849);
            c5362.m9009(false);
        } else {
            c5362.m8957(466062241);
            m1680(obj);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objM8999 = c5362.m8999();
            C4036 c4036 = C2850.f9517;
            if (z || objM8999 == c4036) {
                objM8999 = AbstractC3004.m5600(new C3169(this, i3));
                c5362.m8987(objM8999);
            }
            if (((Boolean) ((InterfaceC5372) objM8999).getValue()).booleanValue()) {
                c5362.m8957(466470356);
                Object objM89910 = c5362.m8999();
                if (objM89910 == c4036) {
                    objM89910 = AbstractC3925.m7061(c5362);
                    c5362.m8987(objM89910);
                }
                InterfaceC4643 interfaceC4643 = (InterfaceC4643) objM89910;
                boolean zM8977 = c5362.m8977(interfaceC4643) | (i4 == 32);
                Object objM89911 = c5362.m8999();
                if (zM8977 || objM89911 == c4036) {
                    objM89911 = new C1708(15, interfaceC4643, this);
                    c5362.m8987(objM89911);
                }
                InterfaceC4745 interfaceC4745 = (InterfaceC4745) objM89911;
                boolean zM8963 = c5362.m8963(interfaceC4643) | c5362.m8963(this);
                Object objM89912 = c5362.m8999();
                if (zM8963 || objM89912 == c4036) {
                    objM89912 = new C4412(interfaceC4745);
                    c5362.m8987(objM89912);
                }
                c5362.m9009(false);
            } else {
                c5362.m8957(467712929);
                c5362.m9009(false);
            }
            c5362.m9009(false);
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0016(i, 9, this, obj);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m1677() {
        C1347 c1347 = this.f2816;
        int size = c1347.size();
        for (int i = 0; i < size; i++) {
            ((C3051) c1347.get(i)).getClass();
        }
        C1347 c1348 = this.f2815;
        int size2 = c1348.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((C0777) c1348.get(i2)).m1677()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m1678(Object obj, Object obj2) {
        this.f2818.m1900(Long.MIN_VALUE);
        C5208 c5208 = this.f2813;
        c5208.f17214.setValue(Boolean.FALSE);
        boolean zM1681 = m1681();
        C4852 c4852 = this.f2814;
        if (!zM1681 || !AbstractC3831.m6874(m1671(), obj) || !AbstractC3831.m6874(c4852.getValue(), obj2)) {
            if (!AbstractC3831.m6874(m1671(), obj) && (c5208 instanceof C5208)) {
                c5208.f17213.setValue(obj);
            }
            c4852.setValue(obj2);
            this.f2817.setValue(Boolean.TRUE);
            this.f2809.setValue(new C2451(obj, obj2));
        }
        C1347 c1347 = this.f2815;
        int size = c1347.size();
        for (int i = 0; i < size; i++) {
            C0777 c0777 = (C0777) c1347.get(i);
            if (c0777.m1681()) {
                c0777.m1678(c0777.m1671(), c0777.f2814.getValue());
            }
        }
        C1347 c1348 = this.f2816;
        int size2 = c1348.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C3051) c1348.get(i2)).m5655();
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m1679() {
        this.f2818.m1900(Long.MIN_VALUE);
        C5208 c5208 = this.f2813;
        if (c5208 instanceof C5208) {
            c5208.f17213.setValue(this.f2814.getValue());
        }
        if (this.f2811 == null) {
            this.f2810.m1900(0L);
        }
        c5208.f17214.setValue(Boolean.FALSE);
        C1347 c1347 = this.f2815;
        int size = c1347.size();
        for (int i = 0; i < size; i++) {
            ((C0777) c1347.get(i)).m1679();
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m1680(Object obj) {
        C4852 c4852 = this.f2814;
        if (AbstractC3831.m6874(c4852.getValue(), obj)) {
            return;
        }
        this.f2809.setValue(new C2451(c4852.getValue(), obj));
        if (!AbstractC3831.m6874(m1671(), c4852.getValue())) {
            this.f2813.f17213.setValue(c4852.getValue());
        }
        c4852.setValue(obj);
        if (this.f2818.m1901() == Long.MIN_VALUE) {
            this.f2812.setValue(Boolean.TRUE);
        }
        C1347 c1347 = this.f2816;
        int size = c1347.size();
        for (int i = 0; i < size; i++) {
            ((C3051) c1347.get(i)).f10270.m1710(-2.0f);
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean m1681() {
        return ((Boolean) this.f2817.getValue()).booleanValue();
    }
}
