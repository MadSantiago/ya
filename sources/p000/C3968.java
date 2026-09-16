package p000;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۦِْؔۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3968 implements InterfaceC3391 {

    /* JADX INFO: renamed from: ۥَ */
    public final long f13264;

    /* JADX INFO: renamed from: ۥْ */
    public final ThreadLocal f13265 = new ThreadLocal();

    /* JADX INFO: renamed from: ۥٓ */
    public final AtomicBoolean f13266 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۦ۟ */
    public final C4736 f13267;

    /* JADX INFO: renamed from: ۦۨ */
    public final C4736 f13268;

    public C3968(final C5002 c5002, final String str, int i) {
        final int i2 = 0;
        C4036 c4036 = C5805.f19128;
        this.f13264 = AbstractC4009.m7166(30, EnumC3021.SECONDS);
        if (i <= 0) {
            C1078.m2272("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.f13268 = new C4736(i, new InterfaceC4448() { // from class: ۥۧؓٙٙ
            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i3 = i2;
                String str2 = str;
                C5002 c5003 = c5002;
                switch (i3) {
                    case 0:
                        InterfaceC3879 interfaceC3879Mo5739 = c5003.mo5739(str2);
                        C4773.m8153(interfaceC3879Mo5739, "PRAGMA query_only = 1");
                        return interfaceC3879Mo5739;
                    default:
                        return c5003.mo5739(str2);
                }
            }
        });
        final int i3 = 1;
        this.f13267 = new C4736(1, new InterfaceC4448() { // from class: ۥۧؓٙٙ
            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i4 = i3;
                String str2 = str;
                C5002 c5003 = c5002;
                switch (i4) {
                    case 0:
                        InterfaceC3879 interfaceC3879Mo5739 = c5003.mo5739(str2);
                        C4773.m8153(interfaceC3879Mo5739, "PRAGMA query_only = 1");
                        return interfaceC3879Mo5739;
                    default:
                        return c5003.mo5739(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f13266.compareAndSet(false, true)) {
            this.f13268.m8057();
            this.f13267.m8057();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7123(boolean z) {
        String str = z ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.f13267.m8056(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.f13268.m8056(sb);
        C4773.m8154(5, sb.toString());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01d4 A[Catch: all -> 0x015c, TRY_ENTER, TryCatch #10 {all -> 0x015c, blocks: (B:73:0x013c, B:75:0x0142, B:80:0x0158, B:84:0x0162, B:88:0x016c, B:104:0x01d4, B:105:0x01db, B:106:0x01dc, B:107:0x01dd, B:108:0x01e0), top: B:150:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01dc A[Catch: all -> 0x015c, TryCatch #10 {all -> 0x015c, blocks: (B:73:0x013c, B:75:0x0142, B:80:0x0158, B:84:0x0162, B:88:0x016c, B:104:0x01d4, B:105:0x01db, B:106:0x01dc, B:107:0x01dd, B:108:0x01e0), top: B:150:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01dd A[Catch: all -> 0x015c, TryCatch #10 {all -> 0x015c, blocks: (B:73:0x013c, B:75:0x0142, B:80:0x0158, B:84:0x0162, B:88:0x016c, B:104:0x01d4, B:105:0x01db, B:106:0x01dc, B:107:0x01dd, B:108:0x01e0), top: B:150:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:137:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0142 A[Catch: all -> 0x015c, TryCatch #10 {all -> 0x015c, blocks: (B:73:0x013c, B:75:0x0142, B:80:0x0158, B:84:0x0162, B:88:0x016c, B:104:0x01d4, B:105:0x01db, B:106:0x01dc, B:107:0x01dd, B:108:0x01e0), top: B:150:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0157  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0161  */
    /* JADX WARN: Code duplicated, block: B:86:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x016c A[Catch: all -> 0x015c, TRY_LEAVE, TryCatch #10 {all -> 0x015c, blocks: (B:73:0x013c, B:75:0x0142, B:80:0x0158, B:84:0x0162, B:88:0x016c, B:104:0x01d4, B:105:0x01db, B:106:0x01dc, B:107:0x01dd, B:108:0x01e0), top: B:150:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x019c  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a6 A[Catch: all -> 0x01d3, TRY_LEAVE, TryCatch #3 {all -> 0x01d3, blocks: (B:92:0x01a0, B:94:0x01a6, B:96:0x01b0, B:97:0x01b5, B:99:0x01c5, B:101:0x01cf, B:102:0x01d2, B:98:0x01c0), top: B:139:0x01a0, inners: #11 }] */
    @Override // p000.InterfaceC3391
    /* JADX INFO: renamed from: ۦٗ */
    public final Object mo6150(boolean z, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
        C5747 c5747;
        C4736 c4736;
        C5450 c5450;
        Throwable th;
        C4736 c4737;
        C5450 c5451;
        InterfaceC3534 interfaceC3534;
        InterfaceC5731 interfaceC5732;
        boolean z2;
        C3968 c3968;
        C5450 c5452;
        C3847 c3847;
        C5880 c5880;
        Object objM5144;
        Object obj;
        C5450 c5453;
        boolean z3;
        C5880 c5881;
        ReentrantLock reentrantLock;
        C3968 c3969 = this;
        boolean z4 = z;
        InterfaceC5731 interfaceC5733 = interfaceC5731;
        if (abstractC0772 instanceof C5747) {
            c5747 = (C5747) abstractC0772;
            int i = c5747.f18950;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5747.f18950 = i - Integer.MIN_VALUE;
            } else {
                c5747 = new C5747(c3969, abstractC0772);
            }
        } else {
            c5747 = new C5747(c3969, abstractC0772);
        }
        InterfaceC3534 interfaceC3535 = c5747.f2791;
        Object obj2 = c5747.f18955;
        int i2 = c5747.f18950;
        InterfaceC0443 interfaceC0443 = null;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i2 == 0) {
            AbstractC0186.m409(obj2);
            if (c3969.f13266.get()) {
                C4773.m8154(21, "Connection pool is closed");
                throw null;
            }
            ThreadLocal threadLocal = c3969.f13265;
            C5880 c5882 = (C5880) threadLocal.get();
            C4036 c4036 = C4064.f13536;
            if (c5882 == null) {
                C4064 c4064 = (C4064) interfaceC3535.mo865(c4036);
                c5882 = c4064 != null ? c4064.f13537 : null;
            }
            if (c5882 == null) {
                c4736 = z4 ? c3969.f13268 : c3969.f13267;
                c5450 = new C5450();
                try {
                    c5451 = new C5450();
                    try {
                        long j = c3969.f13264;
                        C0061 c0061 = new C0061(c5451, c4736, interfaceC0443, 10);
                        c5747.f18953 = c3969;
                        c5747.f18952 = (Serializable) interfaceC5733;
                        c5747.f18954 = c4736;
                        c5747.f18958 = c5450;
                        c5747.f18959 = interfaceC3535;
                        c5747.f18956 = c5451;
                        c5747.f18957 = z4;
                        c5747.f18950 = 3;
                        long jM5125 = AbstractC2765.m5125(j);
                        if (jM5125 <= 0) {
                            throw new C4862("Timed out immediately", null);
                        }
                        if (AbstractC2776.m5213(new RunnableC1491(jM5125, c5747), c0061) != enumC2282) {
                            th = null;
                            interfaceC3534 = interfaceC3535;
                            interfaceC5732 = interfaceC5733;
                            z2 = z4;
                            c3968 = c3969;
                            c5452 = c5450;
                            c3847 = (C3847) c5451.f17965;
                            if (c3847 != null) {
                                c3847.f12861 = interfaceC3534;
                                c3847.f12862 = new Throwable();
                                if (c3968.f13268 == c3968.f13267) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                c5880 = new C5880(c3847, z3);
                            } else {
                                c5880 = null;
                            }
                            c5452.f17965 = c5880;
                            if (!(th instanceof C4862)) {
                                c3968.m7123(z2);
                                throw null;
                            }
                            if (th == null) {
                                throw th;
                            }
                            if (c5880 != null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            c3968.getClass();
                            InterfaceC3534 interfaceC3534M7963 = AbstractC4593.m7963(new C4064(c5880), new C0464(c5880, c3968.f13265));
                            C0023 c0023 = new C0023(interfaceC5732, c5452, interfaceC0443, 16);
                            c5747.f18953 = c4736;
                            c5747.f18952 = c5452;
                            c5747.f18954 = null;
                            c5747.f18958 = null;
                            c5747.f18959 = null;
                            c5747.f18956 = null;
                            c5747.f18950 = 4;
                            objM5144 = AbstractC2765.m5144(interfaceC3534M7963, c0023, c5747);
                            if (objM5144 != enumC2282) {
                                obj = objM5144;
                                c5453 = c5452;
                                c4737 = c4736;
                                c5881 = (C5880) c5453.f17965;
                                if (c5881 != null) {
                                    if (c5881.f19411.compareAndSet(false, true)) {
                                        C4773.m8153(c5881.f19410, "ROLLBACK TRANSACTION");
                                    }
                                    C3847 c3848 = c5881.f19410;
                                    c3848.f12861 = null;
                                    c3848.f12862 = null;
                                    reentrantLock = c4737.f15626;
                                    reentrantLock.lock();
                                    c4737.f15630.m8268(c3848);
                                    reentrantLock.unlock();
                                    c4737.f15633.m9532();
                                }
                                return obj;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c4737 = c4736;
                }
            } else {
                if (!z4 && c5882.f19409) {
                    C4773.m8154(1, "Cannot upgrade connection from reader to writer");
                    throw null;
                }
                if (interfaceC3535.mo865(c4036) == null) {
                    InterfaceC3534 interfaceC3534M7964 = AbstractC4593.m7963(new C4064(c5882), new C0464(c5882, threadLocal));
                    C0023 c0024 = new C0023(interfaceC5733, c5882, interfaceC0443, 15);
                    c5747.f18950 = 1;
                    Object objM5145 = AbstractC2765.m5144(interfaceC3534M7964, c0024, c5747);
                    if (objM5145 != enumC2282) {
                        return objM5145;
                    }
                } else {
                    c5747.f18950 = 2;
                    Object objMo219 = interfaceC5733.mo219(c5882, c5747);
                    if (objMo219 != enumC2282) {
                        return objMo219;
                    }
                }
            }
            return enumC2282;
        }
        if (i2 == 1) {
            AbstractC0186.m409(obj2);
            return obj2;
        }
        if (i2 == 2) {
            AbstractC0186.m409(obj2);
            return obj2;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C5450 c5454 = (C5450) c5747.f18952;
            c4737 = (C4736) c5747.f18953;
            try {
                AbstractC0186.m409(obj2);
                obj = obj2;
                c5453 = c5454;
                try {
                    c5881 = (C5880) c5453.f17965;
                    if (c5881 != null) {
                        if (c5881.f19411.compareAndSet(false, true)) {
                            try {
                                C4773.m8153(c5881.f19410, "ROLLBACK TRANSACTION");
                            } catch (SQLException unused) {
                            }
                        }
                        C3847 c3849 = c5881.f19410;
                        c3849.f12861 = null;
                        c3849.f12862 = null;
                        reentrantLock = c4737.f15626;
                        reentrantLock.lock();
                        try {
                            c4737.f15630.m8268(c3849);
                            reentrantLock.unlock();
                            c4737.f15633.m9532();
                        } catch (Throwable th4) {
                            reentrantLock.unlock();
                            throw th4;
                        }
                    }
                } catch (Throwable unused2) {
                }
                return obj;
            } catch (Throwable th5) {
                th = th5;
                c5450 = c5454;
                th = th;
                throw th;
            }
        }
        boolean z5 = c5747.f18957;
        C5450 c5455 = c5747.f18956;
        interfaceC3535 = c5747.f18959;
        C5450 c5456 = c5747.f18958;
        c4736 = c5747.f18954;
        InterfaceC5731 interfaceC5734 = (InterfaceC5731) c5747.f18952;
        C3968 c39610 = (C3968) c5747.f18953;
        try {
            AbstractC0186.m409(obj2);
            c5451 = c5455;
            z4 = z5;
            c3969 = c39610;
            c5450 = c5456;
            interfaceC5733 = interfaceC5734;
            th = null;
        } catch (Throwable th6) {
            th = th6;
            c5451 = c5455;
            z4 = z5;
            c3969 = c39610;
            c5450 = c5456;
            interfaceC5733 = interfaceC5734;
        }
        interfaceC3534 = interfaceC3535;
        interfaceC5732 = interfaceC5733;
        z2 = z4;
        c3968 = c3969;
        c5452 = c5450;
        try {
            c3847 = (C3847) c5451.f17965;
            if (c3847 != null) {
                c3847.f12861 = interfaceC3534;
                c3847.f12862 = new Throwable();
                if (c3968.f13268 == c3968.f13267 && z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c5880 = new C5880(c3847, z3);
            } else {
                c5880 = null;
            }
            c5452.f17965 = c5880;
            if (!(th instanceof C4862)) {
                c3968.m7123(z2);
                throw null;
            }
            if (th == null) {
                throw th;
            }
            if (c5880 != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c3968.getClass();
            InterfaceC3534 interfaceC3534M7965 = AbstractC4593.m7963(new C4064(c5880), new C0464(c5880, c3968.f13265));
            C0023 c0025 = new C0023(interfaceC5732, c5452, interfaceC0443, 16);
            c5747.f18953 = c4736;
            c5747.f18952 = c5452;
            c5747.f18954 = null;
            c5747.f18958 = null;
            c5747.f18959 = null;
            c5747.f18956 = null;
            c5747.f18950 = 4;
            objM5144 = AbstractC2765.m5144(interfaceC3534M7965, c0025, c5747);
            if (objM5144 != enumC2282) {
                obj = objM5144;
                c5453 = c5452;
                c4737 = c4736;
                c5881 = (C5880) c5453.f17965;
                if (c5881 != null) {
                    if (c5881.f19411.compareAndSet(false, true)) {
                        C4773.m8153(c5881.f19410, "ROLLBACK TRANSACTION");
                    }
                    C3847 c38410 = c5881.f19410;
                    c38410.f12861 = null;
                    c38410.f12862 = null;
                    reentrantLock = c4737.f15626;
                    reentrantLock.lock();
                    c4737.f15630.m8268(c38410);
                    reentrantLock.unlock();
                    c4737.f15633.m9532();
                }
                return obj;
            }
            return enumC2282;
        } catch (Throwable th7) {
            th = th7;
            c5450 = c5452;
            c4737 = c4736;
            th = th;
            throw th;
        }
        try {
            throw th;
        } catch (Throwable th8) {
            try {
                C5880 c5883 = (C5880) c5450.f17965;
                if (c5883 == null) {
                    throw th8;
                }
                if (c5883.f19411.compareAndSet(false, true)) {
                    try {
                        C4773.m8153(c5883.f19410, "ROLLBACK TRANSACTION");
                    } catch (SQLException unused3) {
                    }
                }
                C3847 c38411 = c5883.f19410;
                c38411.f12861 = null;
                c38411.f12862 = null;
                ReentrantLock reentrantLock2 = c4737.f15626;
                reentrantLock2.lock();
                try {
                    c4737.f15630.m8268(c38411);
                    reentrantLock2.unlock();
                    c4737.f15633.m9532();
                    throw th8;
                } catch (Throwable th9) {
                    reentrantLock2.unlock();
                    throw th9;
                }
            } catch (Throwable th10) {
                AbstractC5537.m9223(th, th10);
                throw th8;
            }
        }
    }

    public C3968(C5002 c5002) {
        C4036 c4036 = C5805.f19128;
        this.f13264 = AbstractC4009.m7166(30, EnumC3021.SECONDS);
        C4736 c4736 = new C4736(1, new C0101(8, c5002));
        this.f13268 = c4736;
        this.f13267 = c4736;
    }
}
