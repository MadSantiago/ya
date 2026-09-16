package p000;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦۗۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4994 extends AbstractC0072 implements InterfaceC4707, InterfaceC4636, InterfaceC4311, InterfaceC4005 {

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ long f16531 = AbstractC3456.f11473.objectFieldOffset(C4994.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: ۥَ */
    public int f16532;

    public C4994(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p000.InterfaceC4311
    public final Object getValue() {
        C5536 c5536 = AbstractC2776.f9256;
        Object objectVolatile = AbstractC3456.f11473.getObjectVolatile(this, f16531);
        if (objectVolatile == c5536) {
            return null;
        }
        return objectVolatile;
    }

    @Override // p000.AbstractC0072
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC0063 mo7284() {
        return new C3615();
    }

    @Override // p000.AbstractC0072
    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC0063[] mo7285() {
        return new C3615[2];
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d3 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006a, B:30:0x0074, B:33:0x007b, B:34:0x007f, B:36:0x0082, B:46:0x00a3, B:49:0x00b0, B:50:0x00cc, B:56:0x00dc, B:53:0x00d3, B:55:0x00d9, B:38:0x0088, B:42:0x008f, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:50:0x00cc->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00af -> B:28:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.InterfaceC4707
    /* JADX INFO: renamed from: ۥۗ */
    public final java.lang.Object mo1575(p000.InterfaceC4161 r14, p000.InterfaceC0443 r15) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4994.mo1575(ۦٔؑۢٞ, ۥَؕؒٝ):java.lang.Object");
    }

    @Override // p000.InterfaceC4636
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4707 mo1913(InterfaceC3534 interfaceC3534, int i, int i2) {
        return ((((i < 0 || i >= 2) && i != -2) || i2 != 2) && !((i == 0 || i == -3) && i2 == 1)) ? new C2072(this, interfaceC3534, i, i2) : this;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final boolean m8386(Object obj, Object obj2) {
        C5536 c5536 = AbstractC2776.f9256;
        if (obj == null) {
            obj = c5536;
        }
        if (obj2 == null) {
            obj2 = c5536;
        }
        return m8388(obj, obj2);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m8387(Object obj) {
        if (obj == null) {
            obj = AbstractC2776.f9256;
        }
        m8388(null, obj);
    }

    @Override // p000.InterfaceC4161
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo978(Object obj, InterfaceC0443 interfaceC0443) {
        m8387(obj);
        return C2358.f7817;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final boolean m8388(Object obj, Object obj2) {
        int i;
        AbstractC0063[] abstractC0063Arr;
        C5536 c5536;
        synchronized (this) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f16531;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !AbstractC3831.m6874(objectVolatile, obj)) {
                return false;
            }
            if (AbstractC3831.m6874(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.f16532;
            if ((i2 & 1) != 0) {
                this.f16532 = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f16532 = i3;
            AbstractC0063[] abstractC0063Arr2 = (AbstractC0063[]) this.f13680;
            while (true) {
                C3615[] c3615Arr = (C3615[]) abstractC0063Arr2;
                if (c3615Arr != null) {
                    for (C3615 c3615 : c3615Arr) {
                        if (c3615 != null) {
                            AtomicReference atomicReference = c3615.f12049;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 == null || obj3 == (c5536 = AbstractC1605.f5394)) {
                                    break;
                                }
                                C5536 c5537 = AbstractC1605.f5395;
                                if (obj3 != c5537) {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, c5537)) {
                                            ((C2600) obj3).mo335(C2358.f7817);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, c5536)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f16532;
                    if (i == i3) {
                        this.f16532 = i3 + 1;
                        return true;
                    }
                    abstractC0063Arr = (AbstractC0063[]) this.f13680;
                }
                abstractC0063Arr2 = abstractC0063Arr;
                i3 = i;
            }
        }
    }
}
