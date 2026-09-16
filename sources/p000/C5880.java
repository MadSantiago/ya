package p000;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۦۨؔۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5880 implements InterfaceC0238, InterfaceC2755 {

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f19409;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3847 f19410;

    /* JADX INFO: renamed from: ۥؗ */
    public final C5219 f19408 = new C5219();

    /* JADX INFO: renamed from: ۦؑ */
    public final AtomicBoolean f19411 = new AtomicBoolean(false);

    public C5880(C3847 c3847, boolean z) {
        this.f19410 = c3847;
        this.f19409 = z;
    }

    @Override // p000.InterfaceC2755
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC3879 mo466() {
        return this.f19410;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: ۥُ */
    public final Object m9690(EnumC1806 enumC1806, AbstractC0772 abstractC0772) {
        C3105 c3105;
        C3847 c3847;
        if (abstractC0772 instanceof C3105) {
            c3105 = (C3105) abstractC0772;
            int i = c3105.f10411;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3105.f10411 = i - Integer.MIN_VALUE;
            } else {
                c3105 = new C3105(this, abstractC0772);
            }
        } else {
            c3105 = new C3105(this, abstractC0772);
        }
        Object obj = c3105.f10412;
        int i2 = c3105.f10411;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            c3105.f10409 = this;
            c3105.f10408 = enumC1806;
            c3847 = this.f19410;
            c3105.f10410 = c3847;
            c3105.f10411 = 1;
            Object objMo2949 = c3847.f12863.mo2949(c3105);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objMo2949 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C3847 c3848 = c3105.f10410;
            enumC1806 = c3105.f10408;
            C5880 c5880 = c3105.f10409;
            AbstractC0186.m409(obj);
            c3847 = c3848;
            this = c5880;
        }
        try {
            C5219 c5219 = this.f19408;
            C3847 c3849 = this.f19410;
            int i3 = c5219.f17233;
            if (c5219.isEmpty()) {
                int iOrdinal = enumC1806.ordinal();
                if (iOrdinal == 0) {
                    C4773.m8153(c3849, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    C4773.m8153(c3849, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new C1228(6);
                    }
                    C4773.m8153(c3849, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                C4773.m8153(c3849, "SAVEPOINT '" + i3 + '\'');
            }
            c5219.addLast(new C2696(i3));
            C2358 c2358 = C2358.f7817;
            c3847.mo2950(null);
            return c2358;
        } catch (Throwable th) {
            c3847.mo2950(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: ۥّ */
    public final Object m9691(boolean z, AbstractC0772 abstractC0772) {
        C1915 c1915;
        C3847 c3847;
        if (abstractC0772 instanceof C1915) {
            c1915 = (C1915) abstractC0772;
            int i = c1915.f6309;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1915.f6309 = i - Integer.MIN_VALUE;
            } else {
                c1915 = new C1915(this, abstractC0772);
            }
        } else {
            c1915 = new C1915(this, abstractC0772);
        }
        Object obj = c1915.f6310;
        int i2 = c1915.f6309;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            c1915.f6307 = this;
            c3847 = this.f19410;
            c1915.f6306 = c3847;
            c1915.f6308 = z;
            c1915.f6309 = 1;
            Object objMo2949 = c3847.f12863.mo2949(c1915);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objMo2949 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = c1915.f6308;
            C3847 c3848 = c1915.f6306;
            C5880 c5880 = c1915.f6307;
            AbstractC0186.m409(obj);
            c3847 = c3848;
            this = c5880;
        }
        try {
            C5219 c5219 = this.f19408;
            C3847 c3849 = this.f19410;
            if (c5219.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            C2696 c2696 = (C2696) AbstractC3649.m6528(c5219);
            if (z) {
                c2696.getClass();
                if (c5219.isEmpty()) {
                    C4773.m8153(c3849, "END TRANSACTION");
                } else {
                    C4773.m8153(c3849, "RELEASE SAVEPOINT '" + c2696.f8944 + '\'');
                }
            } else if (c5219.isEmpty()) {
                C4773.m8153(c3849, "ROLLBACK TRANSACTION");
            } else {
                C4773.m8153(c3849, "ROLLBACK TRANSACTION TO SAVEPOINT '" + c2696.f8944 + '\'');
            }
            C2358 c2358 = C2358.f7817;
            c3847.mo2950(null);
            return c2358;
        } catch (Throwable th) {
            c3847.mo2950(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.InterfaceC1550
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo467(String str, InterfaceC4745 interfaceC4745, AbstractC0772 abstractC0772) {
        C5156 c5156;
        C3847 c3847;
        if (abstractC0772 instanceof C5156) {
            c5156 = (C5156) abstractC0772;
            int i = c5156.f17084;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5156.f17084 = i - Integer.MIN_VALUE;
            } else {
                c5156 = new C5156(this, abstractC0772);
            }
        } else {
            c5156 = new C5156(this, abstractC0772);
        }
        Object obj = c5156.f17086;
        int i2 = c5156.f17084;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            if (this.f19411.get()) {
                C4773.m8154(21, "Connection is recycled");
                throw null;
            }
            C4064 c4064 = (C4064) c5156.f2791.mo865(C4064.f13536);
            if (c4064 == null || c4064.f13537 != this) {
                C4773.m8154(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            c5156.f17081 = this;
            c5156.f17080 = str;
            c5156.f17082 = interfaceC4745;
            c3847 = this.f19410;
            c5156.f17085 = c3847;
            c5156.f17084 = 1;
            Object objMo2949 = c3847.f12863.mo2949(c5156);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objMo2949 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C3847 c3848 = c5156.f17085;
            interfaceC4745 = c5156.f17082;
            str = c5156.f17080;
            C5880 c5880 = c5156.f17081;
            AbstractC0186.m409(obj);
            c3847 = c3848;
            this = c5880;
        }
        try {
            C2082 c2082 = new C2082(this, this.f19410.f12864.mo971(str));
            try {
                Object objMo211 = interfaceC4745.mo211(c2082);
                AbstractC1434.m3052(c2082, null);
                c3847.mo2950(null);
                return objMo211;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1434.m3052(c2082, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            c3847.mo2950(null);
            throw th3;
        }
    }

    @Override // p000.InterfaceC0238
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo500(EnumC1806 enumC1806, InterfaceC5731 interfaceC5731, AbstractC2426 abstractC2426) {
        if (this.f19411.get()) {
            C4773.m8154(21, "Connection is recycled");
            throw null;
        }
        C4064 c4064 = (C4064) abstractC2426.f2791.mo865(C4064.f13536);
        if (c4064 != null && c4064.f13537 == this) {
            return m9692(enumC1806, interfaceC5731, abstractC2426);
        }
        C4773.m8154(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // p000.InterfaceC0238
    /* JADX INFO: renamed from: ۦؑ */
    public final Object mo501(AbstractC2426 abstractC2426) {
        if (this.f19411.get()) {
            C4773.m8154(21, "Connection is recycled");
            throw null;
        }
        C4064 c4064 = (C4064) abstractC2426.f2791.mo865(C4064.f13536);
        if (c4064 != null && c4064.f13537 == this) {
            return Boolean.valueOf(!this.f19408.isEmpty());
        }
        C4773.m8154(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۦۙ */
    public final Object m9692(EnumC1806 enumC1806, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) throws Throwable {
        C4208 c4208;
        C5880 c5880;
        int i;
        SQLException e;
        Throwable th;
        boolean z;
        if (abstractC0772 instanceof C4208) {
            c4208 = (C4208) abstractC0772;
            int i2 = c4208.f13973;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4208.f13973 = i2 - Integer.MIN_VALUE;
            } else {
                c4208 = new C4208(this, abstractC0772);
            }
        } else {
            c4208 = new C4208(this, abstractC0772);
        }
        Object objMo219 = c4208.f13974;
        int i3 = c4208.f13973;
        byte b = 0;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        try {
            if (i3 == 0) {
                AbstractC0186.m409(objMo219);
                if (enumC1806 == null) {
                    enumC1806 = EnumC1806.f6013;
                }
                c4208.f13971 = this;
                c4208.f13970 = (Serializable) interfaceC5731;
                c4208.f13973 = 1;
                if (m9690(enumC1806, c4208) != enumC2282) {
                }
                return enumC2282;
            }
            if (i3 == 1) {
                interfaceC5731 = (InterfaceC5731) c4208.f13970;
                this = (C5880) c4208.f13971;
                AbstractC0186.m409(objMo219);
            } else {
                if (i3 != 2) {
                    if (i3 == 3 || i3 == 4) {
                        Object obj = c4208.f13971;
                        AbstractC0186.m409(objMo219);
                        return obj;
                    }
                    if (i3 != 5) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) c4208.f13970;
                    th = (Throwable) c4208.f13971;
                    try {
                        AbstractC0186.m409(objMo219);
                        throw th;
                    } catch (SQLException e2) {
                        e = e2;
                        if (th != null) {
                            throw e;
                        }
                        AbstractC5537.m9223(th, e);
                        throw th;
                    }
                }
                i = c4208.f13972;
                c5880 = (C5880) c4208.f13971;
                try {
                    AbstractC0186.m409(objMo219);
                    z = i != 0;
                    c4208.f13971 = objMo219;
                    c4208.f13973 = 3;
                    if (c5880.m9691(z, c4208) != enumC2282) {
                        return enumC2282;
                    }
                    return objMo219;
                } catch (Throwable th2) {
                    th = th2;
                    this = c5880;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        try {
                            c4208.f13971 = th;
                            c4208.f13970 = th3;
                            c4208.f13973 = 5;
                            if (this.m9691(false, c4208) != enumC2282) {
                                throw th3;
                            }
                        } catch (SQLException e3) {
                            e = e3;
                            th = th3;
                            if (th != null) {
                                throw e;
                            }
                            AbstractC5537.m9223(th, e);
                            throw th;
                        }
                    }
                }
            }
            C0202 c0202 = new C0202(b == true ? 1 : 0, this);
            c4208.f13971 = this;
            c4208.f13970 = null;
            c4208.f13972 = 1;
            c4208.f13973 = 2;
            objMo219 = interfaceC5731.mo219(c0202, c4208);
            if (objMo219 != enumC2282) {
                c5880 = this;
                i = 1;
                if (i != 0) {
                }
                c4208.f13971 = objMo219;
                c4208.f13973 = 3;
                if (c5880.m9691(z, c4208) != enumC2282) {
                    return objMo219;
                }
            }
            return enumC2282;
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }
}
