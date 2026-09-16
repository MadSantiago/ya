package p000;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥؘؙٖؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0724 implements InterfaceC5065 {

    /* JADX INFO: renamed from: ۥَ */
    public final InterfaceC2003 f2640;

    /* JADX INFO: renamed from: ۥْ */
    public final Object[] f2641;

    /* JADX INFO: renamed from: ۥٓ */
    public final C2561 f2642;

    /* JADX INFO: renamed from: ۥٖ */
    public volatile boolean f2643;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f2644;

    /* JADX INFO: renamed from: ۦٗ */
    public C0201 f2645;

    /* JADX INFO: renamed from: ۦۛ */
    public Throwable f2646;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f2647;

    /* JADX INFO: renamed from: ۦۨ */
    public final C4828 f2648;

    public C0724(C4828 c4828, Object obj, Object[] objArr, C2561 c2561, InterfaceC2003 interfaceC2003) {
        this.f2648 = c4828;
        this.f2647 = obj;
        this.f2641 = objArr;
        this.f2642 = c2561;
        this.f2640 = interfaceC2003;
    }

    @Override // p000.InterfaceC5065
    public final void cancel() {
        C0201 c0201;
        this.f2643 = true;
        synchronized (this) {
            c0201 = this.f2645;
        }
        if (c0201 != null) {
            c0201.cancel();
        }
    }

    @Override // p000.InterfaceC5065
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final InterfaceC5065 mo9763clone() {
        return new C0724(this.f2648, this.f2647, this.f2641, this.f2642, this.f2640);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C0201 m1597() throws IOException {
        C0201 c0201 = this.f2645;
        if (c0201 != null) {
            return c0201;
        }
        Throwable th = this.f2646;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            C0201 c0201M1600 = m1600();
            this.f2645 = c0201M1600;
            return c0201M1600;
        } catch (IOException | Error | RuntimeException e) {
            AbstractC4554.m7910(e);
            this.f2646 = e;
            throw e;
        }
    }

    @Override // p000.InterfaceC5065
    /* JADX INFO: renamed from: ۥَ */
    public final boolean mo1598() {
        boolean z = true;
        if (this.f2643) {
            return true;
        }
        synchronized (this) {
            try {
                C0201 c0201 = this.f2645;
                if (c0201 == null || !c0201.f732) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC5065
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1599(InterfaceC3901 interfaceC3901) {
        C0201 c0201;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f2644) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f2644 = true;
                c0201 = this.f2645;
                th = this.f2646;
                if (c0201 == null && th == null) {
                    try {
                        C0201 c0201M1600 = m1600();
                        this.f2645 = c0201M1600;
                        c0201 = c0201M1600;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC4554.m7910(th);
                        this.f2646 = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC3901.mo3081(th);
            return;
        }
        if (this.f2643) {
            c0201.cancel();
        }
        c0201.m463(new C3369(20, this, interfaceC3901, false));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C0201 m1600() {
        C3303 c3303;
        C0774 c0774M6064;
        C4828 c4828 = this.f2648;
        AbstractC4489[] abstractC4489Arr = c4828.f15903;
        Object[] objArr = this.f2641;
        int length = objArr.length;
        if (length != abstractC4489Arr.length) {
            C1078.m2272(AbstractC3761.m6630(abstractC4489Arr.length, ")", AbstractC5078.m8680(length, "Argument count (", ") doesn't match expected count (")));
            return null;
        }
        C1781 c1781 = new C1781(c4828.f15899, c4828.f15893, c4828.f15894, c4828.f15895, c4828.f15904, c4828.f15897, c4828.f15902, c4828.f15901);
        if (c4828.f15900) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            abstractC4489Arr[i].mo963(c1781, objArr[i]);
        }
        C0774 c0774 = c1781.f5940;
        C3303 c3304 = c1781.f5943;
        if (c3304 != null) {
            c0774M6064 = c3304.m6064();
        } else {
            String str = c1781.f5937;
            try {
                c3303 = new C3303();
                c3303.m6062(c0774, str);
            } catch (IllegalArgumentException unused) {
                c3303 = null;
            }
            C0774 c0774M6065 = c3303 != null ? c3303.m6064() : null;
            if (c0774M6065 == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(c0774);
                C2316.m4363(sb, ", Relative: ", c1781.f5937);
                return null;
            }
            c0774M6064 = c0774M6065;
        }
        AbstractC2577 c5607 = c1781.f5946;
        if (c5607 == null) {
            C5002 c5002 = c1781.f5944;
            if (c5002 != null) {
                c5607 = new C3345((ArrayList) c5002.f16551, (ArrayList) c5002.f16550);
            } else {
                C2808 c2808 = c1781.f5945;
                if (c2808 != null) {
                    ArrayList arrayList2 = (ArrayList) c2808.f9377;
                    if (arrayList2.isEmpty()) {
                        C1078.m2276("Multipart body must have at least one part.");
                        return null;
                    }
                    c5607 = new C1528((C1007) c2808.f9378, (C0822) c2808.f9376, AbstractC4031.m7213(arrayList2));
                } else if (c1781.f5941) {
                    AbstractC4031.m7219(0L, 0L, 0L);
                    c5607 = new C4909(null, 0, new byte[0]);
                }
            }
        }
        C0822 c0822 = c1781.f5947;
        C5086 c5086 = c1781.f5939;
        if (c0822 != null) {
            if (c5607 != null) {
                c5607 = new C5607(c5607, c0822);
            } else {
                c5086.m8691("Content-Type", c0822.f2917);
            }
        }
        C1414 c1414 = c1781.f5938;
        c1414.f4871 = c0774M6064;
        c1414.f4869 = c5086.m8701().m8046();
        c1414.m3006(c1781.f5942, c5607);
        c1414.m2988(C3513.class, new C3513(c4828.f15898, this.f2647, c4828.f15896, arrayList));
        return new C0201(this.f2642, c1414.m2998());
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C4633 m1601(C2147 c2147) throws IOException {
        AbstractC2978 abstractC2978 = c2147.f7039;
        C1033 c1033M4176 = c2147.m4176();
        c1033M4176.f3652 = new C1933(abstractC2978.mo3795(), abstractC2978.mo3796());
        C2147 c2147M2239 = c1033M4176.m2239();
        int i = c2147M2239.f7033;
        if (i < 200 || i >= 300) {
            try {
                abstractC2978.mo3797().mo2674(new C1270());
                abstractC2978.mo3795();
                abstractC2978.mo3796();
                if (c2147M2239.m4177()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                C4633 c4633 = new C4633(c2147M2239, null);
                abstractC2978.close();
                return c4633;
            } catch (Throwable th) {
                abstractC2978.close();
                throw th;
            }
        }
        if (i == 204 || i == 205) {
            abstractC2978.close();
            if (c2147M2239.m4177()) {
                return new C4633(c2147M2239, null);
            }
            C1078.m2272("rawResponse must be successful response");
            return null;
        }
        C4465 c4465 = new C4465(abstractC2978);
        try {
            Object objMo804 = this.f2640.mo804(c4465);
            if (c2147M2239.m4177()) {
                return new C4633(c2147M2239, objMo804);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = c4465.f14722;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // p000.InterfaceC5065
    /* JADX INFO: renamed from: ۦ۟ */
    public final synchronized C2813 mo1602() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m1597().f745;
    }

    public final Object clone() {
        return new C0724(this.f2648, this.f2647, this.f2641, this.f2642, this.f2640);
    }
}
