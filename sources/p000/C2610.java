package p000;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥَۢؓۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2610 implements InterfaceC0465 {

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ long f8701;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ long f8702;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ long f8703;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5835 f8704;

    static {
        Unsafe unsafe = AbstractC3456.f11473;
        f8701 = unsafe.objectFieldOffset(C2610.class.getDeclaredField("_isCompleting$volatile"));
        f8702 = unsafe.objectFieldOffset(C2610.class.getDeclaredField("_rootCause$volatile"));
        f8703 = unsafe.objectFieldOffset(C2610.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public C2610(C5835 c5835, Throwable th) {
        this.f8704 = c5835;
        this._rootCause$volatile = th;
    }

    public final String toString() {
        return "Finishing[cancelling=" + m4917() + ", completing=" + m4918() + ", rootCause=" + m4916() + ", exceptions=" + AbstractC3456.f11473.getObjectVolatile(this, f8703) + ", list=" + this.f8704 + ']';
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Throwable m4916() {
        return (Throwable) AbstractC3456.f11473.getObjectVolatile(this, f8702);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m4917() {
        return m4916() != null;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final boolean m4918() {
        return AbstractC3456.f11473.getIntVolatile(this, f8701) == 1;
    }

    @Override // p000.InterfaceC0465
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo981() {
        return m4916() == null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4919(Throwable th) {
        Throwable thM4916 = m4916();
        if (thM4916 == null) {
            AbstractC3456.f11473.putObjectVolatile(this, f8702, th);
            return;
        }
        if (th == thM4916) {
            return;
        }
        Unsafe unsafe = AbstractC3456.f11473;
        long j = f8703;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                C5028.m8449(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    @Override // p000.InterfaceC0465
    /* JADX INFO: renamed from: ۦؑ */
    public final C5835 mo982() {
        return this.f8704;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final ArrayList m4920(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = AbstractC3456.f11473;
        long j = f8703;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                C5028.m8449(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable thM4916 = m4916();
        if (thM4916 != null) {
            arrayList.add(0, thM4916);
        }
        if (th != null && !th.equals(thM4916)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, AbstractC5378.f17770);
        return arrayList;
    }
}
