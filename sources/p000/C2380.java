package p000;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: renamed from: ۥۜؔ۠ؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2380 implements InterfaceC0658, InterfaceC2073 {

    /* JADX INFO: renamed from: ۦٛ */
    public static final String f7886 = new String();

    /* JADX INFO: renamed from: ۥؗ */
    public C0506 f7887;

    /* JADX INFO: renamed from: ۥُ */
    public AbstractC4028 f7888;

    /* JADX INFO: renamed from: ۥّ */
    public C4407 f7889;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f7890;

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ C5086 f7891;

    /* JADX INFO: renamed from: ۥۣ */
    public final Level f7892;

    /* JADX INFO: renamed from: ۦؑ */
    public AbstractC0897 f7893;

    /* JADX INFO: renamed from: ۦۙ */
    public Object[] f7894;

    public C2380(C5086 c5086, Level level) {
        this.f7891 = c5086;
        AbstractC4049.f13495.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.f7887 = null;
        this.f7893 = null;
        this.f7888 = null;
        this.f7889 = null;
        this.f7894 = null;
        AbstractC3933.m7065(level, "level");
        this.f7892 = level;
        this.f7890 = nanos;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [ۦّٖؔٞ] */
    /* JADX WARN: Type inference failed for: r10v22, types: [ۥۧؕٝۦ] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r18v0, types: [ۥۜؔ۠ؔ] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [ۦّٖؔٞ] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [ۦّٖؔٞ] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // p000.InterfaceC2073
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo4014(String str, Object[] objArr) {
        boolean z;
        C0506 c0506;
        StackTraceElement[] stackTraceElementArr;
        int iM1147;
        int i;
        C5423 c5423;
        ?? c0247;
        ?? r10;
        C1828 c1828;
        int i2;
        InterfaceC4083 c0195 = this.f7893;
        C5062 c5062 = AbstractC0897.f3239;
        if (c0195 == null) {
            ((C1735) AbstractC4049.f13495).getClass();
            C1735.f5769.getClass();
            this.f7893 = c5062;
            c0195 = c5062;
        }
        if (c0195 != c5062) {
            C0506 c0507 = this.f7887;
            if (c0507 != null && (i2 = c0507.f1826) > 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (AbstractC1676.f5584.equals(c0507.mo1149(i3))) {
                        c0195 = new C0195(c0195, c0507.mo1145(i3));
                    }
                }
            }
        } else {
            c0195 = null;
        }
        AbstractC4489 abstractC4489M4459 = m4459();
        int iMo1150 = abstractC4489M4459.mo1150();
        for (int i4 = 0; i4 < iMo1150; i4++) {
            if (abstractC4489M4459.mo1149(i4).f8744 == "eye3tag") {
                if (abstractC4489M4459.mo1148(AbstractC1676.f5587) != null) {
                    break;
                }
                C2632 c2632 = AbstractC1676.f5589;
                if (abstractC4489M4459.mo1148(c2632) != null) {
                    break;
                }
                m4458(c2632, EnumC1396.f4776);
                break;
            }
        }
        C0506 c0508 = this.f7887;
        int i5 = -1;
        C1828 c1829 = AbstractC4028.f13428;
        if (c0508 != null) {
            if (c0195 != null) {
                int i6 = C4579.f15109;
                if (c0508.mo1148(AbstractC1676.f5588) != null) {
                    C0178.m382();
                    return;
                }
                C0506 c0509 = this.f7887;
                C1609 c1609 = C5423.f17902;
                Integer num = (Integer) c0509.mo1148(AbstractC1676.f5585);
                if (num == null) {
                    c0247 = 0;
                } else {
                    c5423 = (C5423) C5423.f17902.m9496(c0195, c0509);
                    if (c5423.f17903.incrementAndGet() < num.intValue()) {
                        c0247 = c5423;
                        c0247 = c1829;
                    }
                }
                c0247 = c5423;
                C0506 c05010 = this.f7887;
                C1609 c16010 = C2874.f9595;
                Integer num2 = (Integer) c05010.mo1148(AbstractC1676.f5582);
                if (num2 == null || num2.intValue() <= 0) {
                    r10 = 0;
                } else {
                    r10 = (C2874) C2874.f9595.m9496(c0195, c05010);
                    int iNextInt = ((Random) C2874.f9594.get()).nextInt(num2.intValue());
                    AtomicInteger atomicInteger = r10.f9596;
                    if ((iNextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        r10 = c1829;
                    }
                }
                if (c0247 == 0) {
                    c0247 = r10;
                } else if (r10 != 0 && c0247 != c1829 && r10 != (c1828 = AbstractC4028.f13427)) {
                    if (r10 == c1829 || c0247 == c1828) {
                        c0247 = r10;
                    } else {
                        c0247 = new C0247(c0247, r10);
                    }
                }
                this.f7888 = c0247;
                z = c0247 != c1829;
            }
            C0506 c05011 = this.f7887;
            C2632 c2633 = AbstractC1676.f5589;
            EnumC1396 enumC1396 = (EnumC1396) c05011.mo1148(c2633);
            if (enumC1396 != null) {
                C0506 c05012 = this.f7887;
                if (c05012 != null && (iM1147 = c05012.m1147(c2633)) >= 0) {
                    int i7 = iM1147 + iM1147;
                    int i8 = i7 + 2;
                    while (true) {
                        i = c05012.f1826;
                        if (i8 >= i + i) {
                            break;
                        }
                        Object obj = c05012.f1825[i8];
                        if (!obj.equals(c2633)) {
                            Object[] objArr2 = c05012.f1825;
                            objArr2[i7] = obj;
                            objArr2[i7 + 1] = objArr2[i8 + 1];
                            i7 += 2;
                        }
                        i8 += 2;
                    }
                    c05012.f1826 = i - ((i8 - i7) >> 1);
                    while (i7 < i8) {
                        c05012.f1825[i7] = null;
                        i7++;
                    }
                }
                AbstractC4489 abstractC4489M44510 = m4459();
                C2632 c2634 = AbstractC1676.f5587;
                Throwable th = (Throwable) abstractC4489M44510.mo1148(c2634);
                int i9 = enumC1396.f4777;
                String[] strArr = AbstractC4341.f14327;
                if (i9 <= 0 && i9 != -1) {
                    C1078.m2272("invalid maximum depth: 0");
                    return;
                }
                AbstractC4341.f14326.getClass();
                if (!(i9 == -1 || i9 > 0)) {
                    C1078.m2272("maxDepth must be > 0 or -1");
                    return;
                }
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                String name = C2380.class.getName();
                int i10 = 3;
                boolean z2 = false;
                while (true) {
                    if (i10 >= stackTrace.length) {
                        i10 = -1;
                        break;
                    }
                    if (!stackTrace[i10].getClassName().equals(name)) {
                        if (z2) {
                            break;
                        }
                    } else {
                        z2 = true;
                    }
                    i10++;
                }
                if (i10 == -1) {
                    stackTraceElementArr = new StackTraceElement[0];
                } else {
                    int length = stackTrace.length - i10;
                    if (i9 <= 0 || i9 >= length) {
                        i9 = length;
                    }
                    stackTraceElementArr = new StackTraceElement[i9];
                    System.arraycopy(stackTrace, i10, stackTraceElementArr, 0, i9);
                }
                C4074 c4074 = new C4074(enumC1396.toString(), th);
                c4074.setStackTrace(stackTraceElementArr);
                m4458(c2634, c4074);
            }
        }
        AbstractC4028 abstractC4028 = this.f7888;
        if (abstractC4028 != null) {
            C3361 c3361 = (C3361) C3361.f11234.m9496(c0195, this.f7887);
            AtomicInteger atomicInteger2 = c3361.f11235;
            AtomicBoolean atomicBoolean = c3361.f11236;
            int iIncrementAndGet = atomicInteger2.incrementAndGet();
            if (abstractC4028 != c1829 && atomicBoolean.compareAndSet(false, true)) {
                try {
                    abstractC4028.mo525();
                    atomicBoolean.set(false);
                    atomicInteger2.addAndGet(-iIncrementAndGet);
                    i5 = (-1) + iIncrementAndGet;
                } catch (Throwable th2) {
                    atomicBoolean.set(false);
                    throw th2;
                }
            }
            if (z && i5 > 0 && (c0506 = this.f7887) != null) {
                c0506.m1146(AbstractC1676.f5583, Integer.valueOf(i5));
            }
            z &= i5 >= 0;
        }
        if (z) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            this.f7894 = objArrCopyOf;
            for (Object obj2 : objArrCopyOf) {
            }
            if (str != f7886) {
                C4605 c4605 = C4605.f15200;
                this.f7889 = new C4407(str);
            }
            ((C1735) AbstractC4049.f13495).getClass();
            C5324 c5324Mo1289 = C0583.f2176.mo1289();
            if (!c5324Mo1289.f17570.isEmpty()) {
                AbstractC4489 abstractC4489M44511 = m4459();
                C5663 c5663 = AbstractC1676.f5586;
                C5324 c5324 = (C5324) abstractC4489M44511.mo1148(c5663);
                if (c5324 != null) {
                    C5441 c5441 = c5324.f17570;
                    if (!c5441.isEmpty()) {
                        C5441 c5442 = c5324Mo1289.f17570;
                        if (!c5442.isEmpty()) {
                            c5324 = new C5324(new C5441(c5442, c5441));
                        }
                        c5324Mo1289 = c5324;
                    }
                }
                m4458(c5663, c5324Mo1289);
            }
            AbstractC5633 abstractC5633 = (AbstractC5633) this.f7891.f16877;
            try {
                C5245 c5245 = (C5245) C5245.f17313.get();
                int i11 = c5245.f17314 + 1;
                c5245.f17314 = i11;
                if (i11 == 0) {
                    throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                }
                try {
                    if (i11 <= 100) {
                        abstractC5633.mo4097(this);
                    } else {
                        C5086.m8686("unbounded recursion in log statement", this);
                    }
                    c5245.close();
                } catch (Throwable th3) {
                    try {
                        c5245.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (RuntimeException e) {
                try {
                    abstractC5633.mo4096(e, this);
                } catch (RuntimeException e2) {
                    String name2 = e2.getClass().getName();
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder(name2.length() + 2 + String.valueOf(message).length());
                    sb.append(name2);
                    sb.append(": ");
                    sb.append(message);
                    C5086.m8686(sb.toString(), this);
                    try {
                        e2.printStackTrace(System.err);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m4458(C2632 c2632, Object obj) {
        C0506 c0506 = this.f7887;
        if (c0506 == null) {
            c0506 = new C0506();
            c0506.f1825 = new Object[8];
            c0506.f1826 = 0;
            this.f7887 = c0506;
        }
        c0506.m1146(c2632, obj);
    }

    @Override // p000.InterfaceC2073
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC2073 mo4015() {
        C0676 c0676 = new C0676();
        c0676.f2476 = 0;
        if (this.f7893 == null) {
            this.f7893 = c0676;
        }
        return this;
    }

    @Override // p000.InterfaceC2073
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2073 mo4016(Throwable th) {
        C2632 c2632 = AbstractC1676.f5587;
        AbstractC3933.m7065(c2632, "metadata key");
        if (th != null) {
            m4458(c2632, th);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC4489 m4459() {
        C0506 c0506 = this.f7887;
        return c0506 != null ? c0506 : C4649.f15336;
    }
}
