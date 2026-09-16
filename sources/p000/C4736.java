package p000;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۦٝؓؑۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4736 {

    /* JADX INFO: renamed from: ۥؗ */
    public final ReentrantLock f15626 = new ReentrantLock();

    /* JADX INFO: renamed from: ۥُ */
    public boolean f15627;

    /* JADX INFO: renamed from: ۥّ */
    public final C3847[] f15628;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4448 f15629;

    /* JADX INFO: renamed from: ۥۜ */
    public final C4902 f15630;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f15631;

    /* JADX INFO: renamed from: ۦؑ */
    public int f15632;

    /* JADX INFO: renamed from: ۦۙ */
    public final C2372 f15633;

    public C4736(int i, InterfaceC4448 interfaceC4448) {
        this.f15631 = i;
        this.f15629 = interfaceC4448;
        this.f15628 = new C3847[i];
        int i2 = AbstractC5566.f18377;
        this.f15633 = new C2372(i);
        C4902 c4902 = new C4902(0);
        if (i < 1) {
            AbstractC2552.m4814("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            AbstractC2552.m4814("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        c4902.f16170 = i - 1;
        c4902.f16167 = new Object[i];
        this.f15630 = c4902;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m8056(StringBuilder sb) {
        C4902 c4902 = this.f15630;
        ReentrantLock reentrantLock = this.f15626;
        reentrantLock.lock();
        try {
            C3251 c3251M4189 = AbstractC2164.m4189();
            int i = (c4902.f16166 - c4902.f16168) & c4902.f16170;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = c4902.f16166;
                    int i4 = c4902.f16168;
                    int i5 = c4902.f16170;
                    if (i2 < ((i3 - i4) & i5)) {
                        c3251M4189.add(((Object[]) c4902.f16167)[(i4 + i2) & i5]);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            C3251 c3251M4187 = AbstractC2164.m4187(c3251M4189);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.f15631 + ", ");
            sb.append("permits=" + Math.max(AbstractC3456.f11473.getIntVolatile(this.f15633, C5718.f18816), 0) + ", ");
            sb.append("queue=(size=" + c3251M4187.mo1859() + ")[" + AbstractC0973.m2056(c3251M4187, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            C3847[] c3847Arr = this.f15628;
            int length = c3847Arr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                C3847 c3847 = c3847Arr[i7];
                i6++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i6);
                sb2.append("] - ");
                sb2.append(c3847 != null ? c3847.f12864.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (c3847 != null) {
                    c3847.m6889(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8057() {
        ReentrantLock reentrantLock = this.f15626;
        reentrantLock.lock();
        try {
            this.f15627 = true;
            for (C3847 c3847 : this.f15628) {
                if (c3847 != null) {
                    c3847.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۣ */
    public final Object m8058(AbstractC0772 abstractC0772) {
        C4189 c4189;
        if (abstractC0772 instanceof C4189) {
            c4189 = (C4189) abstractC0772;
            int i = c4189.f13934;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4189.f13934 = i - Integer.MIN_VALUE;
            } else {
                c4189 = new C4189(this, abstractC0772);
            }
        } else {
            c4189 = new C4189(this, abstractC0772);
        }
        Object obj = c4189.f13931;
        int i2 = c4189.f13934;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            c4189.f13932 = this;
            c4189.f13934 = 1;
            Object objM9531 = this.f15633.m9531(c4189);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM9531 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = c4189.f13932;
            AbstractC0186.m409(obj);
        }
        try {
            ReentrantLock reentrantLock = this.f15626;
            C4902 c4902 = this.f15630;
            reentrantLock.lock();
            try {
                if (this.f15627) {
                    C4773.m8154(21, "Connection pool is closed");
                    throw null;
                }
                if (c4902.f16168 == c4902.f16166 && this.f15632 < this.f15631) {
                    C3847 c3847 = new C3847((InterfaceC3879) this.f15629.mo449());
                    C3847[] c3847Arr = this.f15628;
                    int i3 = this.f15632;
                    this.f15632 = i3 + 1;
                    c3847Arr[i3] = c3847;
                    c4902.m8268(c3847);
                }
                int i4 = c4902.f16168;
                if (i4 == c4902.f16166) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object[] objArr = (Object[]) c4902.f16167;
                Object obj2 = objArr[i4];
                objArr[i4] = null;
                c4902.f16168 = (i4 + 1) & c4902.f16170;
                C3847 c3848 = (C3847) obj2;
                reentrantLock.unlock();
                return c3848;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.f15633.m9532();
            throw th2;
        }
    }
}
