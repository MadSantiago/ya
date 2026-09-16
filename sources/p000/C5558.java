package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦٟۢؗؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5558 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f18342;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ Object f18343;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ Object f18344;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5558(Object obj, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f18342 = i;
        this.f18344 = obj;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f18342;
        Object obj2 = this.f18344;
        switch (i) {
            case 0:
                C5558 c5558 = new C5558((C4521) obj2, interfaceC0443, 0);
                c5558.f18343 = obj;
                return c5558;
            case 1:
                C5558 c5559 = new C5558((AbstractC1996) obj2, interfaceC0443, 1);
                c5559.f18343 = obj;
                return c5559;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5558 c55510 = new C5558((InterfaceC4448) obj2, interfaceC0443, 2);
                c55510.f18343 = obj;
                return c55510;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5558 c55511 = new C5558((AbstractC0561) obj2, interfaceC0443, 3);
                c55511.f18343 = obj;
                return c55511;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C5558 c55512 = new C5558((InterfaceC5731) obj2, interfaceC0443, 4);
                c55512.f18343 = obj;
                return c55512;
            default:
                C5558 c55513 = new C5558((Set) obj2, interfaceC0443, 5);
                c55513.f18343 = obj;
                return c55513;
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) throws Throwable {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i = this.f18342;
        boolean z = false;
        InterfaceC0443 interfaceC0443 = null;
        Object obj2 = this.f18344;
        switch (i) {
            case 0:
                AbstractC0186.m409(obj);
                InterfaceC4643 interfaceC4643 = (InterfaceC4643) this.f18343;
                C4521 c4521 = (C4521) obj2;
                InterfaceC3196 interfaceC3196 = (InterfaceC3196) c4521.f14937.getAndSet(null);
                AtomicReference atomicReference = c4521.f14937;
                C2127 c2127M5135 = AbstractC2765.m5135(interfaceC4643, null, 0, new C0023(interfaceC3196, c4521, interfaceC0443, 18), 3);
                while (!atomicReference.compareAndSet(null, c2127M5135)) {
                    if (atomicReference.get() != null) {
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            case 1:
                AbstractC0186.m409(obj);
                AbstractC1996 abstractC1996 = (AbstractC1996) this.f18343;
                if ((abstractC1996 instanceof C4127) && abstractC1996.f6579 <= ((AbstractC1996) obj2).f6579) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC4643 interfaceC4644 = (InterfaceC4643) this.f18343;
                AbstractC0186.m409(obj);
                InterfaceC3534 interfaceC3534Mo1586 = interfaceC4644.mo1586();
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj2;
                try {
                    C0414 c0414 = new C0414();
                    c0414.f1505 = AbstractC5568.m9348(AbstractC5568.m9362(interfaceC3534Mo1586), true, c0414);
                    try {
                        do {
                            unsafe = AbstractC3456.f11473;
                            j = C0414.f1503;
                            intVolatile = unsafe.getIntVolatile(c0414, j);
                            if (intVolatile != 0) {
                                if (intVolatile != 2 && intVolatile != 3) {
                                    C0414.m921(intVolatile);
                                    throw null;
                                }
                            }
                            return interfaceC4448.mo449();
                        } while (!unsafe.compareAndSwapInt(c0414, j, intVolatile, 0));
                        return interfaceC4448.mo449();
                    } finally {
                        c0414.m924();
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0186.m409(obj);
                throw null;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0186.m409(obj);
                AbstractC2132 abstractC2132 = (AbstractC2132) ((InterfaceC4643) this.f18343).mo1586().mo865(C0373.f1369);
                C3529 c3529M7162 = AbstractC4009.m7162();
                AbstractC2765.m5142(C5276.f17389, abstractC2132, 4, new C0061(c3529M7162, (InterfaceC5731) obj2, interfaceC0443, 26));
                while (c3529M7162.m890() instanceof InterfaceC0465) {
                    try {
                        return AbstractC5537.m9243(abstractC2132, new C2718(c3529M7162, interfaceC0443, 14));
                    } catch (InterruptedException unused) {
                    }
                }
                return c3529M7162.m874();
            default:
                AbstractC0186.m409(obj);
                Set setKeySet = ((C1337) this.f18343).m2851().keySet();
                ArrayList arrayList = new ArrayList(AbstractC5573.m9402(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C3637) it.next()).f12167);
                }
                Set set = (Set) obj2;
                if (set == AbstractC3486.f11585) {
                    z = true;
                } else {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) throws Throwable {
        int i = this.f18342;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C5558) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 1:
                return ((C5558) mo217((InterfaceC0443) obj2, (AbstractC1996) obj)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C5558) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((C5558) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
                throw null;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return ((C5558) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            default:
                return ((C5558) mo217((InterfaceC0443) obj2, (C1337) obj)).mo218(c2358);
        }
    }
}
