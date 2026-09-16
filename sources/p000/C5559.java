package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦۢؗۖؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C5559 implements InterfaceC4541 {

    /* JADX INFO: renamed from: ۥؓ */
    public static final /* synthetic */ long f18345;

    /* JADX INFO: renamed from: ۥؖ */
    public static final /* synthetic */ long f18346;

    /* JADX INFO: renamed from: ۥً */
    public static final /* synthetic */ long f18347;

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ AtomicLongFieldUpdater f18348;

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ AtomicLongFieldUpdater f18349;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ AtomicLongFieldUpdater f18350;

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18351;

    /* JADX INFO: renamed from: ۥٙ */
    public static final /* synthetic */ long f18352;

    /* JADX INFO: renamed from: ۥۖ */
    public static final /* synthetic */ long f18353;

    /* JADX INFO: renamed from: ۥۧ */
    public static final /* synthetic */ long f18354;

    /* JADX INFO: renamed from: ۦٕ */
    public static final /* synthetic */ long f18355;

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18356;

    /* JADX INFO: renamed from: ۦٚ */
    public static final /* synthetic */ long f18357;

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ long f18358;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ AtomicLongFieldUpdater f18359 = AtomicLongFieldUpdater.newUpdater(C5559.class, "sendersAndCloseStatus$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f18360;

    static {
        Unsafe unsafe = AbstractC3456.f11473;
        f18357 = unsafe.objectFieldOffset(C5559.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        f18349 = AtomicLongFieldUpdater.newUpdater(C5559.class, "receivers$volatile");
        f18354 = unsafe.objectFieldOffset(C5559.class.getDeclaredField("receivers$volatile"));
        f18350 = AtomicLongFieldUpdater.newUpdater(C5559.class, "bufferEnd$volatile");
        f18353 = unsafe.objectFieldOffset(C5559.class.getDeclaredField("bufferEnd$volatile"));
        f18348 = AtomicLongFieldUpdater.newUpdater(C5559.class, "completedExpandBuffersAndPauseFlag$volatile");
        f18346 = unsafe.objectFieldOffset(C5559.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        f18351 = AtomicReferenceFieldUpdater.newUpdater(C5559.class, Object.class, "sendSegment$volatile");
        f18347 = unsafe.objectFieldOffset(C5559.class.getDeclaredField("sendSegment$volatile"));
        f18356 = AtomicReferenceFieldUpdater.newUpdater(C5559.class, Object.class, "receiveSegment$volatile");
        f18345 = unsafe.objectFieldOffset(C5559.class.getDeclaredField("receiveSegment$volatile"));
        f18355 = unsafe.objectFieldOffset(C5559.class.getDeclaredField("bufferEndSegment$volatile"));
        f18358 = unsafe.objectFieldOffset(C5559.class.getDeclaredField("_closeCause$volatile"));
        f18352 = unsafe.objectFieldOffset(C5559.class.getDeclaredField("closeHandler$volatile"));
    }

    public C5559(int i) {
        long j;
        this.f18360 = i;
        if (i < 0) {
            C1078.m2273(AbstractC5078.m8681(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        C4320 c4320 = AbstractC1786.f5962;
        if (i != 0) {
            j = i != Integer.MAX_VALUE ? i : Long.MAX_VALUE;
        } else {
            j = 0;
        }
        this.bufferEnd$volatile = j;
        this.completedExpandBuffersAndPauseFlag$volatile = m9343();
        C4320 c4321 = new C4320(0L, null, this, 3);
        this.sendSegment$volatile = c4321;
        this.receiveSegment$volatile = c4321;
        this.bufferEndSegment$volatile = m9315() ? AbstractC1786.f5962 : c4321;
        this._closeCause$volatile = AbstractC1786.f5955;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: ۥٕ */
    public static Object m9312(C5559 c5559, AbstractC0772 abstractC0772) {
        C0530 c0530;
        C4320 c4320;
        if (abstractC0772 instanceof C0530) {
            c0530 = (C0530) abstractC0772;
            int i = c0530.f1869;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0530.f1869 = i - Integer.MIN_VALUE;
            } else {
                c0530 = new C0530(c5559, abstractC0772);
            }
        } else {
            c0530 = new C0530(c5559, abstractC0772);
        }
        C0530 c0531 = c0530;
        Object obj = c0531.f1868;
        int i2 = c0531.f1869;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC0186.m409(obj);
                return ((C2368) obj).f7850;
            }
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC0186.m409(obj);
        C4320 c4321 = (C4320) AbstractC3456.f11473.getObjectVolatile(c5559, f18345);
        while (!c5559.m9336()) {
            long andIncrement = f18349.getAndIncrement(c5559);
            long j = AbstractC1786.f5960;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (c4321.f16448 != j2) {
                C4320 c4320M9333 = c5559.m9333(j2, c4321);
                if (c4320M9333 == null) {
                    continue;
                } else {
                    c4320 = c4320M9333;
                }
            } else {
                c4320 = c4321;
            }
            C5559 c55510 = c5559;
            Object objM9331 = c55510.m9331(c4320, i3, andIncrement, null);
            if (objM9331 == AbstractC1786.f5965) {
                C1078.m2276("unexpected");
                return null;
            }
            if (objM9331 != AbstractC1786.f5972) {
                if (objM9331 != AbstractC1786.f5970) {
                    c4320.m3086();
                    return objM9331;
                }
                c0531.f1869 = 1;
                Object objM9327 = c55510.m9327(c4320, i3, andIncrement, c0531);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                return objM9327 == enumC2282 ? enumC2282 : objM9327;
            }
            if (andIncrement < c55510.m9323()) {
                c4320.m3086();
            }
            c5559 = c55510;
            c4321 = c4320;
        }
        return new C4577(c5559.m9342());
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static boolean m9313(Object obj) {
        if (!(obj instanceof InterfaceC4242)) {
            C5028.m8449(obj, "Unexpected waiter: ");
            return false;
        }
        InterfaceC4242 interfaceC4242 = (InterfaceC4242) obj;
        C4320 c4320 = AbstractC1786.f5962;
        C5536 c5536Mo3711 = interfaceC4242.mo3711(C2358.f7817, null);
        if (c5536Mo3711 == null) {
            return false;
        }
        interfaceC4242.mo3710(c5536Mo3711);
        return true;
    }

    @Override // p000.InterfaceC4541
    public final C1893 iterator() {
        return new C1893(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String string;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = AbstractC3456.f11473;
        int longVolatile = (int) (unsafe.getLongVolatile(this, f18357) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f18360 + ',');
        sb.append("data=[");
        int i = 0;
        boolean z = true;
        List listM4188 = AbstractC2164.m4188(unsafe.getObjectVolatile(this, f18345), unsafe.getObjectVolatile(this, f18347), unsafe.getObjectVolatile(this, f18355));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM4188) {
            if (((C4320) obj) != AbstractC1786.f5962) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            C0178.m381();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((C4320) next).f16448;
            do {
                Object next2 = it.next();
                long j2 = ((C4320) next2).f16448;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        C4320 c4320 = (C4320) next;
        long jM9322 = m9322();
        long jM9323 = m9323();
        loop2: while (true) {
            int i2 = AbstractC1786.f5960;
            int i3 = i;
            while (i3 < i2) {
                str = null;
                long j3 = (c4320.f16448 * ((long) AbstractC1786.f5960)) + ((long) i3);
                if (j3 >= jM9323 && j3 >= jM9322) {
                    break loop2;
                }
                Object objM7624 = c4320.m7624(i3);
                boolean z2 = z;
                Object obj2 = c4320.f14285.get(i3 * 2);
                if (objM7624 instanceof InterfaceC4242) {
                    string = (jM9323 > j3 || j3 >= jM9322) ? (jM9322 > j3 || j3 >= jM9323) ? "cont" : "send" : "receive";
                } else if (objM7624 instanceof C0320) {
                    string = "receiveCatching";
                } else if (objM7624 instanceof C0962) {
                    string = "EB(" + objM7624 + ')';
                } else if (AbstractC3831.m6874(objM7624, AbstractC1786.f5957) || AbstractC3831.m6874(objM7624, AbstractC1786.f5969)) {
                    string = "resuming_sender";
                } else {
                    if (objM7624 != null && !objM7624.equals(AbstractC1786.f5956) && !objM7624.equals(AbstractC1786.f5967) && !objM7624.equals(AbstractC1786.f5961) && !objM7624.equals(AbstractC1786.f5968) && !objM7624.equals(AbstractC1786.f5966) && !objM7624.equals(AbstractC1786.f5964)) {
                        string = objM7624.toString();
                    }
                    i3++;
                    z = z2;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i3++;
                z = z2;
            }
            boolean z3 = z;
            str = null;
            c4320 = (C4320) c4320.m3085();
            if (c4320 == null) {
                break;
            }
            z = z3;
            i = 0;
        }
        if (sb.length() == 0) {
            C0178.m384("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(AbstractC0684.m1529(sb)) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final boolean m9315() {
        long jM9343 = m9343();
        return jM9343 == 0 || jM9343 == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final void m9316(long j) {
        C5559 c5559 = this;
        if (c5559.m9315()) {
            return;
        }
        while (c5559.m9343() <= j) {
            c5559 = this;
        }
        int i = AbstractC1786.f5954;
        int i2 = 0;
        while (true) {
            long j2 = f18346;
            if (i2 < i) {
                long jM9343 = c5559.m9343();
                if (jM9343 == (AbstractC3456.f11473.getLongVolatile(c5559, j2) & 4611686018427387903L) && jM9343 == c5559.m9343()) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = AbstractC3456.f11473;
                    long longVolatile = unsafe.getLongVolatile(c5559, j2);
                    if (unsafe.compareAndSwapLong(c5559, f18346, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        c5559 = this;
                    }
                }
                while (true) {
                    long jM9344 = c5559.m9343();
                    Unsafe unsafe2 = AbstractC3456.f11473;
                    long longVolatile2 = unsafe2.getLongVolatile(c5559, j2);
                    long j3 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (jM9344 == j3 && jM9344 == c5559.m9343()) {
                        break;
                    }
                    if (z) {
                        c5559 = this;
                    } else {
                        c5559 = this;
                        unsafe2.compareAndSwapLong(c5559, f18346, longVolatile2, j3 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = AbstractC3456.f11473;
                    long longVolatile3 = unsafe3.getLongVolatile(c5559, j2);
                    if (unsafe3.compareAndSwapLong(c5559, f18346, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        c5559 = this;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥؖ */
    public boolean mo7645() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x016b  */
    /* JADX WARN: Code duplicated, block: B:94:0x016e A[RETURN] */
    @Override // p000.InterfaceC4783
    /* JADX INFO: renamed from: ۥؗ */
    public Object mo5594(InterfaceC0443 interfaceC0443, Object obj) {
        C2358 c2358;
        C2358 c2359;
        Object objM4909;
        int i;
        C5559 c5559 = this;
        Unsafe unsafe = AbstractC3456.f11473;
        long j = f18347;
        C4320 c4320 = (C4320) unsafe.getObjectVolatile(c5559, j);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f18359;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c5559);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zM9325 = c5559.m9325(andIncrement, false);
            int i2 = AbstractC1786.f5960;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = c4320.f16448;
            c2358 = C2358.f7817;
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (j5 != j4) {
                C4320 c4320M9341 = c5559.m9341(j4, c4320);
                if (c4320M9341 != null) {
                    c4320 = c4320M9341;
                } else if (zM9325) {
                    Object objM9317 = m9317(interfaceC0443, obj);
                    if (objM9317 != enumC2282) {
                        break;
                    }
                    return objM9317;
                }
            }
            int iM9334 = c5559.m9334(c4320, i3, obj, j2, null, zM9325);
            if (iM9334 == 0) {
                c4320.m3086();
                return c2358;
            }
            if (iM9334 == 1) {
                break;
            }
            if (iM9334 == 2) {
                if (!zM9325) {
                    return c2358;
                }
                c4320.m8355();
                Object objM9318 = m9317(interfaceC0443, obj);
                return objM9318 == enumC2282 ? objM9318 : c2358;
            }
            if (iM9334 == 3) {
                C2600 c2600M3372 = AbstractC1605.m3372(AbstractC2776.m5232(interfaceC0443));
                try {
                    int iM9335 = m9334(c4320, i3, obj, j2, c2600M3372, false);
                    if (iM9335 != 0) {
                        if (iM9335 == 1) {
                            c2359 = c2358;
                            c2600M3372.mo335(c2359);
                        } else if (iM9335 == 2) {
                            c2359 = c2358;
                            c2600M3372.mo681(c4320, i3 + i2);
                        } else if (iM9335 != 4) {
                            String str = "unexpected";
                            if (iM9335 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            c4320.m3086();
                            C4320 c4321 = (C4320) AbstractC3456.f11473.getObjectVolatile(this, j);
                            while (true) {
                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                long j6 = andIncrement2 & 1152921504606846975L;
                                boolean zM9326 = m9325(andIncrement2, false);
                                int i4 = AbstractC1786.f5960;
                                atomicLongFieldUpdater = atomicLongFieldUpdater;
                                long j7 = i4;
                                c2358 = c2358;
                                long j8 = j6 / j7;
                                int i5 = (int) (j6 % j7);
                                if (c4321.f16448 != j8) {
                                    C4320 c4320M9342 = m9341(j8, c4321);
                                    if (c4320M9342 != null) {
                                        i = i5;
                                        c4321 = c4320M9342;
                                    } else if (zM9326) {
                                        m9339(obj, c2600M3372);
                                        c2359 = c2358;
                                    }
                                } else {
                                    i = i5;
                                }
                                int iM9336 = m9334(c4321, i, obj, j6, c2600M3372, zM9326);
                                if (iM9336 == 0) {
                                    c2359 = c2358;
                                    c4321.m3086();
                                } else if (iM9336 != 1) {
                                    if (iM9336 == 2) {
                                        if (zM9326) {
                                            c4321.m8355();
                                        } else {
                                            c2600M3372.mo681(c4321, i + i4);
                                        }
                                        c2359 = c2358;
                                    } else {
                                        if (iM9336 == 3) {
                                            throw new IllegalStateException(str);
                                        }
                                        if (iM9336 != 4) {
                                            if (iM9336 == 5) {
                                                c4321.m3086();
                                            }
                                            str = str;
                                        } else if (j6 < m9322()) {
                                            c4321.m3086();
                                        }
                                    }
                                    m9339(obj, c2600M3372);
                                    c2359 = c2358;
                                } else {
                                    c2359 = c2358;
                                    c2600M3372.mo335(c2359);
                                }
                            }
                        } else {
                            c2359 = c2358;
                            if (j2 < m9322()) {
                                c4320.m3086();
                            }
                            m9339(obj, c2600M3372);
                        }
                        objM4909 = c2600M3372.m4909();
                        if (objM4909 != enumC2282) {
                            objM4909 = c2359;
                        }
                        if (objM4909 == enumC2282) {
                            return objM4909;
                        }
                        return c2359;
                    }
                    c2359 = c2358;
                    c4320.m3086();
                    c2600M3372.mo335(c2359);
                    objM4909 = c2600M3372.m4909();
                    if (objM4909 != enumC2282) {
                        objM4909 = c2359;
                    }
                    if (objM4909 == enumC2282) {
                        return objM4909;
                    }
                    return c2359;
                } catch (Throwable th) {
                    c2600M3372.m4898();
                    throw th;
                }
            }
            if (iM9334 == 4) {
                if (j2 < m9322()) {
                    c4320.m3086();
                }
                Object objM9319 = m9317(interfaceC0443, obj);
                if (objM9319 != enumC2282) {
                    break;
                }
                return objM9319;
            }
            if (iM9334 == 5) {
                c4320.m3086();
            }
            c5559 = this;
        }
        return c2358;
    }

    /* JADX INFO: renamed from: ۥً */
    public final Object m9317(InterfaceC0443 interfaceC0443, Object obj) {
        C2600 c2600 = new C2600(1, AbstractC2776.m5232(interfaceC0443));
        c2600.m4913();
        c2600.mo335(new C4535(m9318()));
        Object objM4909 = c2600.m4909();
        return objM4909 == EnumC2282.f7590 ? objM4909 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final Throwable m9318() {
        Throwable thM9342 = m9342();
        return thM9342 == null ? new C3759("Channel was closed") : thM9342;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m9319(Throwable th, boolean z) {
        boolean z2;
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j3;
        long longVolatile2;
        Unsafe unsafe4;
        long j4;
        long longVolatile3;
        if (z) {
            do {
                unsafe4 = AbstractC3456.f11473;
                j4 = f18357;
                longVolatile3 = unsafe4.getLongVolatile(this, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                C4320 c4320 = AbstractC1786.f5962;
            } while (!unsafe4.compareAndSwapLong(this, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L));
        }
        C5536 c5536 = AbstractC1786.f5955;
        while (true) {
            Unsafe unsafe5 = AbstractC3456.f11473;
            long j5 = f18358;
            if (unsafe5.compareAndSwapObject(this, j5, c5536, th)) {
                z2 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j5) != c5536) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = AbstractC3456.f11473;
                j3 = f18357;
                longVolatile2 = unsafe3.getLongVolatile(this, j3);
            } while (!unsafe3.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = AbstractC3456.f11473;
                j = f18357;
                longVolatile = unsafe.getLongVolatile(this, j);
                int i = (int) (longVolatile >> 60);
                if (i == 0) {
                    j2 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        }
        m9324();
        if (z2) {
            loop3: while (true) {
                Unsafe unsafe6 = AbstractC3456.f11473;
                long j6 = f18352;
                objectVolatile = unsafe6.getObjectVolatile(this, j6);
                C5536 c5537 = objectVolatile == null ? AbstractC1786.f5958 : AbstractC1786.f5959;
                do {
                    unsafe2 = AbstractC3456.f11473;
                    if (unsafe2.compareAndSwapObject(this, f18352, objectVolatile, c5537)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j6) == objectVolatile);
            }
            if (objectVolatile != null) {
                AbstractC3801.m6782(1, objectVolatile);
                ((InterfaceC4745) objectVolatile).mo211(m9342());
                return z2;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final C4320 m9320(long j) {
        AbstractC1469 abstractC1469;
        long j2;
        Unsafe unsafe;
        long j3;
        Unsafe unsafe2 = AbstractC3456.f11473;
        Object objectVolatile = unsafe2.getObjectVolatile(this, f18355);
        C4320 c4320 = (C4320) unsafe2.getObjectVolatile(this, f18347);
        if (c4320.f16448 > ((C4320) objectVolatile).f16448) {
            objectVolatile = c4320;
        }
        C4320 c4321 = (C4320) unsafe2.getObjectVolatile(this, f18345);
        if (c4321.f16448 > ((C4320) objectVolatile).f16448) {
            objectVolatile = c4321;
        }
        AbstractC1469 abstractC14610 = (AbstractC1469) objectVolatile;
        loop0: while (true) {
            abstractC1469 = abstractC14610;
            while (true) {
                int i = AbstractC1469.f5001;
                abstractC1469.getClass();
                Object objectVolatile2 = AbstractC3456.f11473.getObjectVolatile(abstractC1469, AbstractC1469.f5003);
                C5536 c5536 = AbstractC3831.f12710;
                if (objectVolatile2 == c5536) {
                    break loop0;
                }
                abstractC14610 = (AbstractC1469) objectVolatile2;
                if (abstractC14610 == null) {
                    do {
                        unsafe = AbstractC3456.f11473;
                        j3 = AbstractC1469.f5003;
                        if (unsafe.compareAndSwapObject(abstractC1469, j3, (Object) null, c5536)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(abstractC1469, j3) == null);
                }
            }
        }
        C4320 c4322 = (C4320) abstractC1469;
        if (mo7645()) {
            C4320 c4323 = c4322;
            loop3: while (true) {
                int i2 = AbstractC1786.f5960 - 1;
                while (true) {
                    if (-1 < i2) {
                        j2 = (c4323.f16448 * ((long) AbstractC1786.f5960)) + ((long) i2);
                        if (j2 >= m9322()) {
                            while (true) {
                                Object objM7624 = c4323.m7624(i2);
                                if (objM7624 != null && objM7624 != AbstractC1786.f5956) {
                                    if (objM7624 != AbstractC1786.f5963) {
                                        break;
                                    }
                                    break loop3;
                                }
                                if (c4323.m7623(i2, objM7624, AbstractC1786.f5964)) {
                                    c4323.m8355();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        c4323 = (C4320) ((AbstractC1469) AbstractC3456.f11473.getObjectVolatile(c4323, AbstractC1469.f5002));
                        if (c4323 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                m9340(j2);
            }
        }
        Object objM4810 = null;
        loop6: for (C4320 c4324 = c4322; c4324 != null; c4324 = (C4320) ((AbstractC1469) AbstractC3456.f11473.getObjectVolatile(c4324, AbstractC1469.f5002))) {
            for (int i3 = AbstractC1786.f5960 - 1; -1 < i3; i3--) {
                if ((c4324.f16448 * ((long) AbstractC1786.f5960)) + ((long) i3) < j) {
                    break loop6;
                }
                while (true) {
                    Object objM7625 = c4324.m7624(i3);
                    if (objM7625 != null && objM7625 != AbstractC1786.f5956) {
                        if (!(objM7625 instanceof C0962)) {
                            if (!(objM7625 instanceof InterfaceC2728)) {
                                break;
                            }
                            if (c4324.m7623(i3, objM7625, AbstractC1786.f5964)) {
                                objM4810 = AbstractC2552.m4810(objM4810, objM7625);
                                c4324.m7621(i3, true);
                                break;
                            }
                        } else {
                            if (c4324.m7623(i3, objM7625, AbstractC1786.f5964)) {
                                objM4810 = AbstractC2552.m4810(objM4810, ((C0962) objM7625).f3406);
                                c4324.m7621(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (c4324.m7623(i3, objM7625, AbstractC1786.f5964)) {
                            c4324.m8355();
                            break;
                        }
                    }
                }
            }
        }
        if (objM4810 != null) {
            if (!(objM4810 instanceof ArrayList)) {
                m9332((InterfaceC2728) objM4810, true);
                return c4322;
            }
            ArrayList arrayList = (ArrayList) objM4810;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m9332((InterfaceC2728) arrayList.get(size), true);
            }
        }
        return c4322;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final Throwable m9321() {
        Throwable thM9342 = m9342();
        return thM9342 == null ? new C2823("Channel was closed") : thM9342;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final long m9322() {
        return AbstractC3456.f11473.getLongVolatile(this, f18354);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final long m9323() {
        return AbstractC3456.f11473.getLongVolatile(this, f18357) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final boolean m9324() {
        return m9325(AbstractC3456.f11473.getLongVolatile(this, f18357), false);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m9325(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                m9320(j & 1152921504606846975L);
                if (z) {
                    while (true) {
                        Unsafe unsafe = AbstractC3456.f11473;
                        long j2 = f18345;
                        C4320 c4320M9333 = (C4320) unsafe.getObjectVolatile(this, j2);
                        long jM9322 = m9322();
                        if (m9323() <= jM9322) {
                            break;
                        }
                        long j3 = AbstractC1786.f5960;
                        long j4 = jM9322 / j3;
                        if (c4320M9333.f16448 != j4 && (c4320M9333 = m9333(j4, c4320M9333)) == null) {
                            if (((C4320) unsafe.getObjectVolatile(this, j2)).f16448 < j4) {
                                break;
                            }
                        } else {
                            c4320M9333.m3086();
                            int i2 = (int) (jM9322 % j3);
                            while (true) {
                                Object objM7624 = c4320M9333.m7624(i2);
                                if (objM7624 != null && objM7624 != AbstractC1786.f5956) {
                                    if (objM7624 != AbstractC1786.f5963 && (objM7624 == AbstractC1786.f5966 || objM7624 == AbstractC1786.f5964 || objM7624 == AbstractC1786.f5967 || objM7624 == AbstractC1786.f5961 || (objM7624 != AbstractC1786.f5969 && (objM7624 == AbstractC1786.f5957 || jM9322 != m9322())))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (c4320M9333.m7623(i2, objM7624, AbstractC1786.f5961)) {
                                    m9335();
                                    break;
                                }
                            }
                            AbstractC3456.f11473.compareAndSwapLong(this, f18354, jM9322, jM9322 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    C1078.m2278(AbstractC5078.m8670(i, "unexpected close status: "));
                    return false;
                }
                C4320 c4320M9320 = m9320(j & 1152921504606846975L);
                Object objM4810 = null;
                loop0: do {
                    for (int i3 = AbstractC1786.f5960 - 1; -1 < i3; i3--) {
                        long j5 = (c4320M9320.f16448 * ((long) AbstractC1786.f5960)) + ((long) i3);
                        while (true) {
                            Object objM7625 = c4320M9320.m7624(i3);
                            if (objM7625 == AbstractC1786.f5967) {
                                break loop0;
                            }
                            if (objM7625 != AbstractC1786.f5963) {
                                if (objM7625 != AbstractC1786.f5956 && objM7625 != null) {
                                    if (!(objM7625 instanceof InterfaceC2728) && !(objM7625 instanceof C0962)) {
                                        C5536 c5536 = AbstractC1786.f5969;
                                        if (objM7625 == c5536 || objM7625 == AbstractC1786.f5957) {
                                            break loop0;
                                        }
                                        if (objM7625 != c5536) {
                                            break;
                                        }
                                    } else {
                                        if (j5 < m9322()) {
                                            break loop0;
                                        }
                                        InterfaceC2728 interfaceC2728 = objM7625 instanceof C0962 ? ((C0962) objM7625).f3406 : (InterfaceC2728) objM7625;
                                        if (c4320M9320.m7623(i3, objM7625, AbstractC1786.f5964)) {
                                            objM4810 = AbstractC2552.m4810(objM4810, interfaceC2728);
                                            c4320M9320.m7622(i3, null);
                                            c4320M9320.m8355();
                                            break;
                                        }
                                    }
                                } else {
                                    if (c4320M9320.m7623(i3, objM7625, AbstractC1786.f5964)) {
                                        c4320M9320.m8355();
                                        break;
                                    }
                                }
                            } else {
                                if (j5 < m9322()) {
                                    break loop0;
                                }
                                if (c4320M9320.m7623(i3, objM7625, AbstractC1786.f5964)) {
                                    c4320M9320.m7622(i3, null);
                                    c4320M9320.m8355();
                                    break;
                                }
                            }
                        }
                    }
                    c4320M9320 = (C4320) ((AbstractC1469) AbstractC3456.f11473.getObjectVolatile(c4320M9320, AbstractC1469.f5002));
                } while (c4320M9320 != null);
                if (objM4810 != null) {
                    if (objM4810 instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM4810;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            m9332((InterfaceC2728) arrayList.get(size), false);
                        }
                    } else {
                        m9332((InterfaceC2728) objM4810, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m9326(long j) {
        return j < m9343() || j < m9322() + ((long) this.f18360);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۙ */
    public final Object m9327(C4320 c4320, int i, long j, AbstractC0772 abstractC0772) {
        C5797 c5797;
        C2368 c2368;
        C4320 c4321;
        if (abstractC0772 instanceof C5797) {
            c5797 = (C5797) abstractC0772;
            int i2 = c5797.f19106;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c5797.f19106 = i2 - Integer.MIN_VALUE;
            } else {
                c5797 = new C5797(this, abstractC0772);
            }
        } else {
            c5797 = new C5797(this, abstractC0772);
        }
        Object objM4909 = c5797.f19105;
        int i3 = c5797.f19106;
        if (i3 == 0) {
            AbstractC0186.m409(objM4909);
            c5797.f19106 = 1;
            C2600 c2600M3372 = AbstractC1605.m3372(AbstractC2776.m5232(c5797));
            try {
                C0320 c0320 = new C0320(c2600M3372);
                Object objM9331 = m9331(c4320, i, j, c0320);
                if (objM9331 != AbstractC1786.f5965) {
                    if (objM9331 == AbstractC1786.f5972) {
                        if (j < m9323()) {
                            c4320.m3086();
                        }
                        C4320 c4322 = (C4320) AbstractC3456.f11473.getObjectVolatile(this, f18345);
                        while (true) {
                            if (m9336()) {
                                c2600M3372.mo335(new C2368(new C4577(m9342())));
                                break;
                            }
                            long andIncrement = f18349.getAndIncrement(this);
                            long j2 = AbstractC1786.f5960;
                            long j3 = andIncrement / j2;
                            int i4 = (int) (andIncrement % j2);
                            if (c4322.f16448 != j3) {
                                C4320 c4320M9333 = m9333(j3, c4322);
                                if (c4320M9333 != null) {
                                    c4321 = c4320M9333;
                                }
                            } else {
                                c4321 = c4322;
                            }
                            Object objM9332 = m9331(c4321, i4, andIncrement, c0320);
                            C4320 c4323 = c4321;
                            if (objM9332 == AbstractC1786.f5965) {
                                c0320.mo681(c4323, i4);
                                break;
                            }
                            if (objM9332 == AbstractC1786.f5972) {
                                if (andIncrement < m9323()) {
                                    c4323.m3086();
                                }
                                c4322 = c4323;
                            } else {
                                if (objM9332 == AbstractC1786.f5970) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c4323.m3086();
                                c2368 = new C2368(objM9332);
                            }
                        }
                    } else {
                        c4320.m3086();
                        c2368 = new C2368(objM9331);
                    }
                    c2600M3372.mo3712(c2368, null);
                    break;
                }
                c0320.mo681(c4320, i);
                objM4909 = c2600M3372.m4909();
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objM4909 == enumC2282) {
                    return enumC2282;
                }
            } catch (Throwable th) {
                c2600M3372.m4898();
                throw th;
            }
        } else {
            if (i3 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(objM4909);
        }
        return ((C2368) objM4909).f7850;
    }

    @Override // p000.InterfaceC4541
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo5595() {
        C4320 c4320;
        Unsafe unsafe = AbstractC3456.f11473;
        long longVolatile = unsafe.getLongVolatile(this, f18354);
        long longVolatile2 = unsafe.getLongVolatile(this, f18357);
        if (m9325(longVolatile2, true)) {
            return new C4577(m9342());
        }
        long j = longVolatile2 & 1152921504606846975L;
        C1259 c1259 = C2368.f7849;
        if (longVolatile >= j) {
            return c1259;
        }
        Object obj = AbstractC1786.f5968;
        C4320 c4321 = (C4320) unsafe.getObjectVolatile(this, f18345);
        while (!this.m9336()) {
            long andIncrement = f18349.getAndIncrement(this);
            long j2 = AbstractC1786.f5960;
            long j3 = andIncrement / j2;
            int i = (int) (andIncrement % j2);
            if (c4321.f16448 != j3) {
                C4320 c4320M9333 = this.m9333(j3, c4321);
                if (c4320M9333 == null) {
                    continue;
                } else {
                    c4320 = c4320M9333;
                }
            } else {
                c4320 = c4321;
            }
            C5559 c5559 = this;
            Object objM9331 = c5559.m9331(c4320, i, andIncrement, obj);
            c4321 = c4320;
            if (objM9331 == AbstractC1786.f5965) {
                InterfaceC2728 interfaceC2728 = obj instanceof InterfaceC2728 ? (InterfaceC2728) obj : null;
                if (interfaceC2728 != null) {
                    interfaceC2728.mo681(c4321, i);
                }
                c5559.m9316(andIncrement);
                c4321.m8355();
                return c1259;
            }
            if (objM9331 != AbstractC1786.f5972) {
                if (objM9331 != AbstractC1786.f5970) {
                    c4321.m3086();
                    return objM9331;
                }
                C1078.m2276("unexpected");
                return null;
            }
            if (andIncrement < c5559.m9323()) {
                c4321.m3086();
            }
            this = c5559;
        }
        return new C4577(this.m9342());
    }

    @Override // p000.InterfaceC4541
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo7865(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m9319(cancellationException, true);
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m9328(long j, C4320 c4320) {
        C5559 c5559;
        C4320 c4321;
        C4320 c4322;
        while (c4320.f16448 < j && (c4322 = (C4320) c4320.m3085()) != null) {
            c4320 = c4322;
        }
        while (true) {
            C4320 c4323 = c4320;
            while (c4323.mo3084() && (c4321 = (C4320) c4323.m3085()) != null) {
                c4323 = c4321;
            }
            while (true) {
                Unsafe unsafe = AbstractC3456.f11473;
                long j2 = f18355;
                AbstractC4971 abstractC4971 = (AbstractC4971) unsafe.getObjectVolatile(this, j2);
                if (abstractC4971.f16448 >= c4323.f16448) {
                    return;
                }
                if (!c4323.m8356()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = AbstractC3456.f11473;
                    c5559 = this;
                    if (unsafe2.compareAndSwapObject(c5559, f18355, abstractC4971, c4323)) {
                        if (abstractC4971.m8354()) {
                            abstractC4971.m3087();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(c5559, j2) != abstractC4971) {
                        break;
                    } else {
                        this = c5559;
                    }
                }
                if (c4323.m8354()) {
                    c4323.m3087();
                }
                this = c5559;
            }
            c4320 = c4323;
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m9329(Throwable th) {
        return m9319(th, false);
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final boolean m9330(Object obj, Object obj2) throws C0768 {
        if (obj instanceof C0320) {
            C2600 c2600 = ((C0320) obj).f1176;
            C2368 c2368 = new C2368(obj2);
            C4320 c4320 = AbstractC1786.f5962;
            C5536 c5536Mo3711 = c2600.mo3711(c2368, null);
            if (c5536Mo3711 == null) {
                return false;
            }
            c2600.mo3710(c5536Mo3711);
            return true;
        }
        if (!(obj instanceof C1893)) {
            if (!(obj instanceof InterfaceC4242)) {
                C5028.m8449(obj, "Unexpected receiver type: ");
                return false;
            }
            InterfaceC4242 interfaceC4242 = (InterfaceC4242) obj;
            C4320 c4321 = AbstractC1786.f5962;
            C5536 c5536Mo3712 = interfaceC4242.mo3711(obj2, null);
            if (c5536Mo3712 == null) {
                return false;
            }
            interfaceC4242.mo3710(c5536Mo3712);
            return true;
        }
        C1893 c1893 = (C1893) obj;
        C2600 c2601 = c1893.f6275;
        c1893.f6275 = null;
        c1893.f6276 = obj2;
        Boolean bool = Boolean.TRUE;
        c1893.f6274.getClass();
        C4320 c4322 = AbstractC1786.f5962;
        C5536 c5536Mo3713 = c2601.mo3711(bool, null);
        if (c5536Mo3713 == null) {
            return false;
        }
        c2601.mo3710(c5536Mo3713);
        return true;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final Object m9331(C4320 c4320, int i, long j, Object obj) {
        Object objM7624 = c4320.m7624(i);
        AtomicReferenceArray atomicReferenceArray = c4320.f14285;
        long j2 = f18357;
        if (objM7624 == null) {
            if (j >= (AbstractC3456.f11473.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC1786.f5970;
                }
                if (c4320.m7623(i, objM7624, obj)) {
                    m9335();
                    return AbstractC1786.f5965;
                }
            }
        } else if (objM7624 == AbstractC1786.f5963 && c4320.m7623(i, objM7624, AbstractC1786.f5967)) {
            m9335();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c4320.m7622(i, null);
            return obj2;
        }
        while (true) {
            Object objM7625 = c4320.m7624(i);
            if (objM7625 == null || objM7625 == AbstractC1786.f5956) {
                if (j < (AbstractC3456.f11473.getLongVolatile(this, j2) & 1152921504606846975L)) {
                    if (c4320.m7623(i, objM7625, AbstractC1786.f5961)) {
                        m9335();
                        return AbstractC1786.f5972;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC1786.f5970;
                    }
                    if (c4320.m7623(i, objM7625, obj)) {
                        m9335();
                        return AbstractC1786.f5965;
                    }
                }
            } else if (objM7625 != AbstractC1786.f5963) {
                C5536 c5536 = AbstractC1786.f5966;
                if (objM7625 == c5536) {
                    return AbstractC1786.f5972;
                }
                if (objM7625 == AbstractC1786.f5961) {
                    return AbstractC1786.f5972;
                }
                if (objM7625 == AbstractC1786.f5964) {
                    m9335();
                    return AbstractC1786.f5972;
                }
                if (objM7625 != AbstractC1786.f5969 && c4320.m7623(i, objM7625, AbstractC1786.f5957)) {
                    boolean z = objM7625 instanceof C0962;
                    if (z) {
                        objM7625 = ((C0962) objM7625).f3406;
                    }
                    if (m9313(objM7625)) {
                        c4320.m7626(i, AbstractC1786.f5967);
                        m9335();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        c4320.m7622(i, null);
                        return obj3;
                    }
                    c4320.m7626(i, c5536);
                    c4320.m8355();
                    if (z) {
                        m9335();
                    }
                    return AbstractC1786.f5972;
                }
            } else if (c4320.m7623(i, objM7625, AbstractC1786.f5967)) {
                m9335();
                Object obj4 = atomicReferenceArray.get(i * 2);
                c4320.m7622(i, null);
                return obj4;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final void m9332(InterfaceC2728 interfaceC2728, boolean z) {
        if (interfaceC2728 instanceof InterfaceC4242) {
            ((InterfaceC0443) interfaceC2728).mo335(new C4535(z ? m9321() : m9318()));
            return;
        }
        if (interfaceC2728 instanceof C0320) {
            ((C0320) interfaceC2728).f1176.mo335(new C2368(new C4577(m9342())));
            return;
        }
        if (!(interfaceC2728 instanceof C1893)) {
            C5028.m8449(interfaceC2728, "Unexpected waiter: ");
            return;
        }
        C1893 c1893 = (C1893) interfaceC2728;
        C2600 c2600 = c1893.f6275;
        c1893.f6275 = null;
        c1893.f6276 = AbstractC1786.f5964;
        Throwable thM9342 = c1893.f6274.m9342();
        if (thM9342 == null) {
            c2600.mo335(Boolean.FALSE);
        } else {
            c2600.mo335(new C4535(thM9342));
        }
    }

    @Override // p000.InterfaceC4541
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo5596(C5696 c5696) {
        return m9312(this, c5696);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final C4320 m9333(long j, C4320 c4320) {
        Object objM6870;
        C4320 c4321;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        Unsafe unsafe2;
        C4320 c4322 = AbstractC1786.f5962;
        C1974 c1974 = C1974.f6532;
        loop0: while (true) {
            objM6870 = AbstractC3831.m6870(c4320, j, c1974);
            if (!AbstractC4593.m7987(objM6870)) {
                AbstractC4971 abstractC4971M7971 = AbstractC4593.m7971(objM6870);
                while (true) {
                    Unsafe unsafe3 = AbstractC3456.f11473;
                    long j3 = f18345;
                    AbstractC4971 abstractC4971 = (AbstractC4971) unsafe3.getObjectVolatile(this, j3);
                    if (abstractC4971.f16448 >= abstractC4971M7971.f16448) {
                        break loop0;
                    }
                    if (!abstractC4971M7971.m8356()) {
                        break;
                    }
                    do {
                        unsafe2 = AbstractC3456.f11473;
                        if (unsafe2.compareAndSwapObject(this, f18345, abstractC4971, abstractC4971M7971)) {
                            if (!abstractC4971.m8354()) {
                                break loop0;
                            }
                            abstractC4971.m3087();
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(this, j3) == abstractC4971);
                    if (abstractC4971M7971.m8354()) {
                        abstractC4971M7971.m3087();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC4593.m7987(objM6870)) {
            m9324();
            if (c4320.f16448 * ((long) AbstractC1786.f5960) < m9323()) {
                c4320.m3086();
                return null;
            }
        } else {
            C4320 c4323 = (C4320) AbstractC4593.m7971(objM6870);
            long j4 = c4323.f16448;
            if (m9315() || j > m9343() / ((long) AbstractC1786.f5960)) {
                c4321 = c4323;
                break;
            }
            loop3: while (true) {
                Unsafe unsafe4 = AbstractC3456.f11473;
                long j5 = f18355;
                AbstractC4971 abstractC4972 = (AbstractC4971) unsafe4.getObjectVolatile(this, j5);
                if (abstractC4972.f16448 >= j4 || !c4323.m8356()) {
                    c4321 = c4323;
                    break;
                }
                while (true) {
                    Unsafe unsafe5 = AbstractC3456.f11473;
                    c4321 = c4323;
                    if (unsafe5.compareAndSwapObject(this, f18355, abstractC4972, c4323)) {
                        if (!abstractC4972.m8354()) {
                            break loop3;
                        }
                        abstractC4972.m3087();
                        break loop3;
                    }
                    if (unsafe5.getObjectVolatile(this, j5) != abstractC4972) {
                        break;
                    }
                    c4323 = c4321;
                }
                if (c4321.m8354()) {
                    c4321.m3087();
                }
                c4323 = c4321;
            }
            if (j4 <= j) {
                return c4321;
            }
            long j6 = j4 * ((long) AbstractC1786.f5960);
            do {
                unsafe = AbstractC3456.f11473;
                j2 = f18354;
                longVolatile = unsafe.getLongVolatile(this, j2);
                if (longVolatile >= j6) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j6));
            if (j4 * ((long) AbstractC1786.f5960) < m9323()) {
                c4321.m3086();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦُ */
    public final int m9334(C4320 c4320, int i, Object obj, long j, Object obj2, boolean z) {
        c4320.m7622(i, obj);
        if (z) {
            return m9337(c4320, i, obj, j, obj2, z);
        }
        Object objM7624 = c4320.m7624(i);
        if (objM7624 == null) {
            if (m9326(j)) {
                if (c4320.m7623(i, null, AbstractC1786.f5963)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c4320.m7623(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM7624 instanceof InterfaceC2728) {
            c4320.m7622(i, null);
            if (m9330(objM7624, obj)) {
                c4320.m7626(i, AbstractC1786.f5967);
                return 0;
            }
            C5536 c5536 = AbstractC1786.f5968;
            if (c4320.f14285.getAndSet((i * 2) + 1, c5536) == c5536) {
                return 5;
            }
            c4320.m7621(i, true);
            return 5;
        }
        return m9337(c4320, i, obj, j, obj2, z);
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m9335() {
        Object objM6870;
        Unsafe unsafe;
        C5559 c5559 = this;
        if (c5559.m9315()) {
            return;
        }
        Unsafe unsafe2 = AbstractC3456.f11473;
        long j = f18355;
        C4320 c4320 = (C4320) unsafe2.getObjectVolatile(c5559, j);
        while (true) {
            long andIncrement = f18350.getAndIncrement(c5559);
            long j2 = andIncrement / ((long) AbstractC1786.f5960);
            if (c5559.m9323() <= andIncrement) {
                if (c4320.f16448 < j2 && c4320.m3085() != null) {
                    c5559.m9328(j2, c4320);
                }
                c5559.m9338(1L);
                return;
            }
            if (c4320.f16448 != j2) {
                C1974 c1974 = C1974.f6532;
                while (true) {
                    objM6870 = AbstractC3831.m6870(c4320, j2, c1974);
                    if (AbstractC4593.m7987(objM6870)) {
                        break;
                    }
                    AbstractC4971 abstractC4971M7971 = AbstractC4593.m7971(objM6870);
                    while (true) {
                        AbstractC4971 abstractC4971 = (AbstractC4971) AbstractC3456.f11473.getObjectVolatile(c5559, j);
                        if (abstractC4971.f16448 >= abstractC4971M7971.f16448) {
                            c5559 = this;
                            break;
                        }
                        if (!abstractC4971M7971.m8356()) {
                            break;
                        }
                        do {
                            unsafe = AbstractC3456.f11473;
                            c5559 = this;
                            if (unsafe.compareAndSwapObject(c5559, f18355, abstractC4971, abstractC4971M7971)) {
                                if (!abstractC4971.m8354()) {
                                    break;
                                }
                                abstractC4971.m3087();
                                break;
                            }
                        } while (unsafe.getObjectVolatile(c5559, j) == abstractC4971);
                        if (abstractC4971M7971.m8354()) {
                            abstractC4971M7971.m3087();
                        }
                    }
                    c5559 = this;
                }
                C4320 c4321 = null;
                if (AbstractC4593.m7987(objM6870)) {
                    c5559.m9324();
                    c5559.m9328(j2, c4320);
                    c5559.m9338(1L);
                } else {
                    C4320 c4322 = (C4320) AbstractC4593.m7971(objM6870);
                    long j3 = c4322.f16448;
                    if (j3 > j2) {
                        long j4 = AbstractC1786.f5960;
                        if (AbstractC3456.f11473.compareAndSwapLong(c5559, f18353, andIncrement + 1, j3 * j4)) {
                            c5559.m9338((j3 * j4) - andIncrement);
                        } else {
                            c5559.m9338(1L);
                        }
                    } else {
                        c4321 = c4322;
                    }
                }
                if (c4321 == null) {
                    continue;
                } else {
                    c4320 = c4321;
                }
            }
            int i = (int) (andIncrement % ((long) AbstractC1786.f5960));
            Object objM7624 = c4320.m7624(i);
            boolean z = objM7624 instanceof InterfaceC2728;
            long j5 = f18354;
            if (!z || andIncrement < AbstractC3456.f11473.getLongVolatile(c5559, j5) || !c4320.m7623(i, objM7624, AbstractC1786.f5969)) {
                while (true) {
                    Object objM7625 = c4320.m7624(i);
                    if (objM7625 instanceof InterfaceC2728) {
                        if (andIncrement < AbstractC3456.f11473.getLongVolatile(c5559, j5)) {
                            if (c4320.m7623(i, objM7625, new C0962((InterfaceC2728) objM7625))) {
                                c5559.m9338(1L);
                                return;
                            }
                        } else if (c4320.m7623(i, objM7625, AbstractC1786.f5969)) {
                            if (!m9313(objM7625)) {
                                c4320.m7626(i, AbstractC1786.f5966);
                                c4320.m8355();
                                break;
                            } else {
                                c4320.m7626(i, AbstractC1786.f5963);
                                c5559.m9338(1L);
                                return;
                            }
                        }
                    } else {
                        if (objM7625 == AbstractC1786.f5966) {
                            break;
                        }
                        if (objM7625 == null) {
                            if (c4320.m7623(i, objM7625, AbstractC1786.f5956)) {
                                c5559.m9338(1L);
                                return;
                            }
                        } else if (objM7625 == AbstractC1786.f5963 || objM7625 == AbstractC1786.f5961 || objM7625 == AbstractC1786.f5967 || objM7625 == AbstractC1786.f5968 || objM7625 == AbstractC1786.f5964) {
                            c5559.m9338(1L);
                            return;
                        } else if (objM7625 != AbstractC1786.f5957) {
                            C5028.m8449(objM7625, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                c5559.m9338(1L);
            } else if (m9313(objM7624)) {
                c4320.m7626(i, AbstractC1786.f5963);
                c5559.m9338(1L);
                return;
            } else {
                c4320.m7626(i, AbstractC1786.f5966);
                c4320.m8355();
                c5559.m9338(1L);
            }
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m9336() {
        return m9325(AbstractC3456.f11473.getLongVolatile(this, f18357), true);
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final int m9337(C4320 c4320, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objM7624 = c4320.m7624(i);
            if (objM7624 == null) {
                if (!m9326(j) || z) {
                    if (z) {
                        if (c4320.m7623(i, null, AbstractC1786.f5966)) {
                            c4320.m8355();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c4320.m7623(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c4320.m7623(i, null, AbstractC1786.f5963)) {
                    break;
                }
            } else {
                if (objM7624 != AbstractC1786.f5956) {
                    C5536 c5536 = AbstractC1786.f5968;
                    if (objM7624 == c5536) {
                        c4320.m7622(i, null);
                        return 5;
                    }
                    if (objM7624 == AbstractC1786.f5961) {
                        c4320.m7622(i, null);
                        return 5;
                    }
                    if (objM7624 == AbstractC1786.f5964) {
                        c4320.m7622(i, null);
                        m9324();
                        return 4;
                    }
                    c4320.m7622(i, null);
                    if (objM7624 instanceof C0962) {
                        objM7624 = ((C0962) objM7624).f3406;
                    }
                    if (m9330(objM7624, obj)) {
                        c4320.m7626(i, AbstractC1786.f5967);
                        return 0;
                    }
                    if (c4320.f14285.getAndSet((i * 2) + 1, c5536) != c5536) {
                        c4320.m7621(i, true);
                    }
                    return 5;
                }
                if (c4320.m7623(i, objM7624, AbstractC1786.f5963)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m9338(long j) {
        if ((f18348.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((AbstractC3456.f11473.getLongVolatile(this, f18346) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m9339(Object obj, C2600 c2600) {
        c2600.mo335(new C4535(m9318()));
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m9340(long j) {
        C4320 c4320 = (C4320) AbstractC3456.f11473.getObjectVolatile(this, f18345);
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j2 = f18354;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(((long) this.f18360) + longVolatile, this.m9343())) {
                return;
            }
            this = this;
            if (unsafe.compareAndSwapLong(this, j2, longVolatile, 1 + longVolatile)) {
                long j3 = AbstractC1786.f5960;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (c4320.f16448 != j4) {
                    C4320 c4320M9333 = this.m9333(j4, c4320);
                    if (c4320M9333 != null) {
                        c4320 = c4320M9333;
                    }
                }
                C4320 c4321 = c4320;
                if (this.m9331(c4321, i, longVolatile, null) != AbstractC1786.f5972 || longVolatile < this.m9323()) {
                    c4321.m3086();
                }
                c4320 = c4321;
            }
        }
    }

    @Override // p000.InterfaceC4783
    /* JADX INFO: renamed from: ۦۗ */
    public Object mo5597(Object obj) {
        C5559 c5559 = this;
        Unsafe unsafe = AbstractC3456.f11473;
        long longVolatile = unsafe.getLongVolatile(c5559, f18357);
        long j = 1152921504606846975L;
        boolean z = c5559.m9325(longVolatile, false) ? false : !c5559.m9326(longVolatile & 1152921504606846975L);
        C1259 c1259 = C2368.f7849;
        if (z) {
            return c1259;
        }
        Object obj2 = AbstractC1786.f5966;
        C4320 c4320 = (C4320) unsafe.getObjectVolatile(c5559, f18347);
        while (true) {
            long andIncrement = f18359.getAndIncrement(c5559);
            long j2 = andIncrement & j;
            boolean zM9325 = c5559.m9325(andIncrement, false);
            int i = AbstractC1786.f5960;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (c4320.f16448 != j4) {
                C4320 c4320M9341 = c5559.m9341(j4, c4320);
                if (c4320M9341 != null) {
                    c4320 = c4320M9341;
                } else {
                    if (zM9325) {
                        return new C4577(c5559.m9318());
                    }
                    j = 1152921504606846975L;
                }
            }
            int iM9334 = c5559.m9334(c4320, i2, obj, j2, obj2, zM9325);
            C2358 c2358 = C2358.f7817;
            if (iM9334 == 0) {
                c4320.m3086();
                return c2358;
            }
            if (iM9334 == 1) {
                return c2358;
            }
            if (iM9334 == 2) {
                if (zM9325) {
                    c4320.m8355();
                    return new C4577(m9318());
                }
                InterfaceC2728 interfaceC2728 = obj2 instanceof InterfaceC2728 ? (InterfaceC2728) obj2 : null;
                if (interfaceC2728 != null) {
                    interfaceC2728.mo681(c4320, i2 + i);
                }
                c4320.m8355();
                return c1259;
            }
            if (iM9334 == 3) {
                C1078.m2276("unexpected");
                return null;
            }
            if (iM9334 == 4) {
                if (j2 < m9322()) {
                    c4320.m3086();
                }
                return new C4577(m9318());
            }
            if (iM9334 == 5) {
                c4320.m3086();
            }
            j = 1152921504606846975L;
            c5559 = this;
        }
    }

    @Override // p000.InterfaceC4541
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo5598(InterfaceC0443 interfaceC0443) {
        C4320 c4320;
        Throwable th;
        C4320 c4321;
        Unsafe unsafe = AbstractC3456.f11473;
        long j = f18345;
        C4320 c4322 = (C4320) unsafe.getObjectVolatile(this, j);
        while (!this.m9336()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f18349;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = AbstractC1786.f5960;
            long j3 = andIncrement / j2;
            int i = (int) (andIncrement % j2);
            if (c4322.f16448 != j3) {
                C4320 c4320M9333 = this.m9333(j3, c4322);
                if (c4320M9333 == null) {
                    continue;
                } else {
                    c4320 = c4320M9333;
                }
            } else {
                c4320 = c4322;
            }
            C5559 c5559 = this;
            Object objM9331 = c5559.m9331(c4320, i, andIncrement, null);
            C5536 c5536 = AbstractC1786.f5965;
            if (objM9331 == c5536) {
                C1078.m2276("unexpected");
                return null;
            }
            C5536 c5537 = AbstractC1786.f5972;
            if (objM9331 == c5537) {
                if (andIncrement < c5559.m9323()) {
                    c4320.m3086();
                }
                this = c5559;
                c4322 = c4320;
            } else {
                if (objM9331 != AbstractC1786.f5970) {
                    c4320.m3086();
                    return objM9331;
                }
                C2600 c2600M3372 = AbstractC1605.m3372(AbstractC2776.m5232(interfaceC0443));
                try {
                    Object objM9332 = c5559.m9331(c4320, i, andIncrement, c2600M3372);
                    if (objM9332 != c5536) {
                        if (objM9332 == c5537) {
                            if (andIncrement < c5559.m9323()) {
                                c4320.m3086();
                            }
                            C4320 c4323 = (C4320) AbstractC3456.f11473.getObjectVolatile(c5559, j);
                            while (true) {
                                if (c5559.m9336()) {
                                    c2600M3372.mo335(new C4535(c5559.m9321()));
                                    break;
                                }
                                C2600 c2600 = c2600M3372;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c5559);
                                    long j4 = AbstractC1786.f5960;
                                    long j5 = andIncrement2 / j4;
                                    int i2 = (int) (andIncrement2 % j4);
                                    if (c4323.f16448 != j5) {
                                        try {
                                            C4320 c4320M9334 = c5559.m9333(j5, c4323);
                                            if (c4320M9334 == null) {
                                                c2600M3372 = c2600;
                                            } else {
                                                c4321 = c4320M9334;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c2600M3372 = c2600;
                                            c2600M3372.m4898();
                                            throw th;
                                        }
                                    } else {
                                        c4321 = c4323;
                                    }
                                    C5559 c55510 = c5559;
                                    objM9332 = c55510.m9331(c4321, i2, andIncrement2, c2600);
                                    c5559 = c55510;
                                    C4320 c4324 = c4321;
                                    c2600M3372 = c2600;
                                    if (objM9332 == AbstractC1786.f5965) {
                                        c2600M3372.mo681(c4324, i2);
                                        break;
                                    }
                                    if (objM9332 == AbstractC1786.f5972) {
                                        if (andIncrement2 < c5559.m9323()) {
                                            c4324.m3086();
                                        }
                                        c4323 = c4324;
                                    } else {
                                        if (objM9332 == AbstractC1786.f5970) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c4324.m3086();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c2600M3372 = c2600;
                                    th = th;
                                    c2600M3372.m4898();
                                    throw th;
                                }
                            }
                        } else {
                            c4320.m3086();
                        }
                        c2600M3372.mo3712(objM9332, null);
                        break;
                    }
                    c2600M3372.mo681(c4320, i);
                    return c2600M3372.m4909();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thM9321 = this.m9321();
        int i3 = AbstractC5768.f19013;
        throw thM9321;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final C4320 m9341(long j, C4320 c4320) {
        Object objM6870;
        C4320 c4321;
        long j2;
        Unsafe unsafe;
        C5559 c5559 = this;
        C4320 c4322 = AbstractC1786.f5962;
        C1974 c1974 = C1974.f6532;
        loop0: while (true) {
            objM6870 = AbstractC3831.m6870(c4320, j, c1974);
            if (!AbstractC4593.m7987(objM6870)) {
                AbstractC4971 abstractC4971M7971 = AbstractC4593.m7971(objM6870);
                while (true) {
                    Unsafe unsafe2 = AbstractC3456.f11473;
                    long j3 = f18347;
                    AbstractC4971 abstractC4971 = (AbstractC4971) unsafe2.getObjectVolatile(c5559, j3);
                    if (abstractC4971.f16448 >= abstractC4971M7971.f16448) {
                        break loop0;
                    }
                    if (!abstractC4971M7971.m8356()) {
                        break;
                    }
                    do {
                        unsafe = AbstractC3456.f11473;
                        if (unsafe.compareAndSwapObject(c5559, f18347, abstractC4971, abstractC4971M7971)) {
                            if (!abstractC4971.m8354()) {
                                break loop0;
                            }
                            abstractC4971.m3087();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(c5559, j3) == abstractC4971);
                    if (abstractC4971M7971.m8354()) {
                        abstractC4971M7971.m3087();
                    }
                }
            } else {
                break;
            }
        }
        C4320 c4323 = null;
        if (AbstractC4593.m7987(objM6870)) {
            c5559.m9324();
            if (c4320.f16448 * ((long) AbstractC1786.f5960) >= c5559.m9322()) {
                return null;
            }
            c4320.m3086();
            return null;
        }
        C4320 c4324 = (C4320) AbstractC4593.m7971(objM6870);
        long j4 = c4324.f16448;
        if (j4 <= j) {
            return c4324;
        }
        long j5 = j4 * ((long) AbstractC1786.f5960);
        while (true) {
            Unsafe unsafe3 = AbstractC3456.f11473;
            long j6 = f18357;
            long longVolatile = unsafe3.getLongVolatile(c5559, j6);
            long j7 = 1152921504606846975L & longVolatile;
            if (j7 >= j5) {
                c4321 = c4323;
                j2 = j4;
                break;
            }
            c4321 = c4323;
            j2 = j4;
            if (unsafe3.compareAndSwapLong(c5559, j6, longVolatile, j7 + (((long) ((int) (longVolatile >> 60))) << 60))) {
                break;
            }
            c5559 = this;
            c4323 = c4321;
            j4 = j2;
        }
        if (j2 * ((long) AbstractC1786.f5960) >= m9322()) {
            return c4321;
        }
        c4324.m3086();
        return c4321;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final Throwable m9342() {
        return (Throwable) AbstractC3456.f11473.getObjectVolatile(this, f18358);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final long m9343() {
        return AbstractC3456.f11473.getLongVolatile(this, f18353);
    }
}
