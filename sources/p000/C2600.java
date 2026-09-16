package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥٟۢؒٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C2600 extends AbstractC5549 implements InterfaceC4242, InterfaceC4853, InterfaceC2728 {

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ long f8687;

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ long f8688;

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ long f8689;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: ۥَ */
    public final InterfaceC3534 f8690;

    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 f8691;

    static {
        Unsafe unsafe = AbstractC3456.f11473;
        f8687 = unsafe.objectFieldOffset(C2600.class.getDeclaredField("_decisionAndIndex$volatile"));
        f8689 = unsafe.objectFieldOffset(C2600.class.getDeclaredField("_state$volatile"));
        f8688 = unsafe.objectFieldOffset(C2600.class.getDeclaredField("_parentHandle$volatile"));
    }

    public C2600(int i, InterfaceC0443 interfaceC0443) {
        super(i);
        this.f8691 = interfaceC0443;
        this.f8690 = interfaceC0443.mo334();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C5703.f18785;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public static void m4894(InterfaceC2979 interfaceC2979, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC2979 + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static Object m4895(InterfaceC2979 interfaceC2979, Object obj, int i, InterfaceC2609 interfaceC2609) {
        if (obj instanceof C5036) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (interfaceC2609 != null || (interfaceC2979 instanceof C3011)) {
            return new C2381(obj, interfaceC2979 instanceof C3011 ? (C3011) interfaceC2979 : null, interfaceC2609, (Throwable) null, 16);
        }
        return obj;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(mo3323());
        sb.append('(');
        sb.append(AbstractC4489.m7818(this.f8691));
        sb.append("){");
        Object objectVolatile = AbstractC3456.f11473.getObjectVolatile(this, f8689);
        if (objectVolatile instanceof InterfaceC2979) {
            str = "Active";
        } else {
            str = objectVolatile instanceof C0554 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC4489.m7777(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final boolean m4896() {
        if (this.f18326 == 2) {
            return AbstractC3456.f11473.getObjectVolatile((C4437) this.f8691, C4437.f14625) != null;
        }
        return false;
    }

    @Override // p000.AbstractC5549
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0443 mo4897() {
        return this.f8691;
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m4898() {
        C2600 c2600;
        InterfaceC0443 interfaceC0443 = this.f8691;
        Throwable th = null;
        C4437 c4437 = interfaceC0443 instanceof C4437 ? (C4437) interfaceC0443 : null;
        if (c4437 != null) {
            long j = C4437.f14625;
            loop0: while (true) {
                Object objectVolatile = AbstractC3456.f11473.getObjectVolatile(c4437, j);
                C5536 c5536 = AbstractC5378.f17759;
                if (objectVolatile == c5536) {
                    while (true) {
                        Unsafe unsafe = AbstractC3456.f11473;
                        C2600 c2601 = this;
                        c2600 = c2601;
                        if (unsafe.compareAndSwapObject(c4437, C4437.f14625, c5536, c2601)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(c4437, j) != c5536) {
                            break;
                        } else {
                            this = c2600;
                        }
                    }
                    this = c2600;
                } else {
                    c2600 = this;
                    if (!(objectVolatile instanceof Throwable)) {
                        C5028.m8449(objectVolatile, "Inconsistent state ");
                        return;
                    }
                    while (true) {
                        Unsafe unsafe2 = AbstractC3456.f11473;
                        if (unsafe2.compareAndSwapObject(c4437, C4437.f14625, objectVolatile, (Object) null)) {
                            th = (Throwable) objectVolatile;
                            break;
                        } else if (unsafe2.getObjectVolatile(c4437, j) != objectVolatile) {
                            C1078.m2272("Failed requirement.");
                            return;
                        }
                    }
                }
            }
            if (th == null) {
                return;
            }
            c2600.m4900();
            c2600.mo3713(th);
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m4899(int i) throws C0768 {
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f8687;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    C1078.m2276("Already resumed");
                    return;
                }
                boolean z = i == 4;
                InterfaceC0443 interfaceC0443 = this.f8691;
                if (!z && (interfaceC0443 instanceof C4437)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.f18326;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        C4437 c4437 = (C4437) interfaceC0443;
                        AbstractC2132 abstractC2132 = c4437.f14627;
                        InterfaceC3534 interfaceC3534Mo334 = c4437.f14626.mo334();
                        if (AbstractC5378.m9049(abstractC2132, interfaceC3534Mo334)) {
                            AbstractC5378.m9042(abstractC2132, interfaceC3534Mo334, this);
                            return;
                        }
                        AbstractC5596 abstractC5596M7538 = AbstractC4253.m7538();
                        if (abstractC5596M7538.f18445 >= 4294967296L) {
                            abstractC5596M7538.m9443(this);
                            return;
                        }
                        abstractC5596M7538.m9441(true);
                        try {
                            AbstractC2776.m5221(this, interfaceC0443, true);
                            do {
                            } while (abstractC5596M7538.m9446());
                        } catch (Throwable th) {
                            try {
                                this.m9277(th);
                            } finally {
                                abstractC5596M7538.m9442(true);
                            }
                        }
                        return;
                    }
                }
                AbstractC2776.m5221(this, interfaceC0443, z);
                return;
            }
            C2600 c2600 = this;
            if (unsafe.compareAndSwapInt(c2600, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = c2600;
            }
        }
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC3534 mo334() {
        return this.f8690;
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥّ */
    public final void mo335(Object obj) {
        Throwable thM405 = AbstractC0183.m405(obj);
        if (thM405 != null) {
            obj = new C5036(thM405, false);
        }
        m4910(obj, this.f18326, null);
    }

    @Override // p000.InterfaceC4242
    /* JADX INFO: renamed from: ۥْ */
    public final void mo3710(Object obj) throws C0768 {
        m4899(this.f18326);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m4900() {
        Unsafe unsafe = AbstractC3456.f11473;
        long j = f8688;
        InterfaceC4883 interfaceC4883 = (InterfaceC4883) unsafe.getObjectVolatile(this, j);
        if (interfaceC4883 == null) {
            return;
        }
        interfaceC4883.mo1376();
        unsafe.putObjectVolatile(this, j, C3364.f11240);
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final void m4901(AbstractC2132 abstractC2132) {
        InterfaceC0443 interfaceC0443 = this.f8691;
        C4437 c4437 = interfaceC0443 instanceof C4437 ? (C4437) interfaceC0443 : null;
        m4910(C2358.f7817, (c4437 != null ? c4437.f14627 : null) == abstractC2132 ? 4 : this.f18326, null);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public Throwable mo3322(AbstractC0386 abstractC0386) {
        return abstractC0386.mo862();
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m4902(InterfaceC2979 interfaceC2979) {
        InterfaceC2979 interfaceC29710;
        C2600 c2600;
        C2600 c2601;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = AbstractC3456.f11473;
            long j = f8689;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof C5703) {
                while (true) {
                    Unsafe unsafe3 = AbstractC3456.f11473;
                    C2600 c2602 = this;
                    InterfaceC2979 interfaceC29711 = interfaceC2979;
                    c2600 = c2602;
                    interfaceC29710 = interfaceC29711;
                    if (unsafe3.compareAndSwapObject(c2602, f8689, objectVolatile, interfaceC29711)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(c2600, j) != objectVolatile) {
                        break;
                    }
                    this = c2600;
                    interfaceC2979 = interfaceC29710;
                }
            } else {
                interfaceC29710 = interfaceC2979;
                c2600 = this;
                if ((objectVolatile instanceof C3011) || (objectVolatile instanceof AbstractC4971)) {
                    m4894(interfaceC29710, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof C5036) {
                    C5036 c5036 = (C5036) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(c5036, C5036.f16701, 0, 1)) {
                        m4894(interfaceC29710, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof C0554) {
                        Throwable th = c5036.f16702;
                        if (interfaceC29710 instanceof C3011) {
                            c2600.m4907((C3011) interfaceC29710, th);
                            return;
                        } else {
                            c2600.m4914((AbstractC4971) interfaceC29710, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof C2381) {
                    C2381 c2381 = (C2381) objectVolatile;
                    if (c2381.f7897 != null) {
                        m4894(interfaceC29710, objectVolatile);
                        throw null;
                    }
                    if (interfaceC29710 instanceof AbstractC4971) {
                        return;
                    }
                    C3011 c3011 = (C3011) interfaceC29710;
                    Throwable th2 = c2381.f7896;
                    if (th2 != null) {
                        c2600.m4907(c3011, th2);
                        return;
                    }
                    C2381 c2381M4460 = C2381.m4460(c2381, c3011, null, 29);
                    do {
                        unsafe = AbstractC3456.f11473;
                        if (unsafe.compareAndSwapObject(c2600, f8689, objectVolatile, c2381M4460)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(c2600, j) == objectVolatile);
                } else {
                    if (interfaceC29710 instanceof AbstractC4971) {
                        return;
                    }
                    C2381 c2382 = new C2381(objectVolatile, (C3011) interfaceC29710, (InterfaceC2609) null, (Throwable) null, 28);
                    while (true) {
                        C2381 c2383 = c2382;
                        Unsafe unsafe4 = AbstractC3456.f11473;
                        c2601 = c2600;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(c2601, f8689, objectVolatile, c2383);
                        c2382 = c2383;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(c2601, j) != objectVolatile) {
                            break;
                        } else {
                            c2600 = c2601;
                        }
                    }
                }
                this = c2601;
                interfaceC2979 = interfaceC29710;
            }
            c2601 = c2600;
            this = c2601;
            interfaceC2979 = interfaceC29710;
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceC4883 m4903() {
        InterfaceC3196 interfaceC3196 = (InterfaceC3196) this.f8690.mo865(C1397.f4791);
        if (interfaceC3196 == null) {
            return null;
        }
        InterfaceC4883 interfaceC4883M9348 = AbstractC5568.m9348(interfaceC3196, true, new C2681(this));
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f8688;
            C2600 c2600 = this;
            if (unsafe.compareAndSwapObject(c2600, j, (Object) null, interfaceC4883M9348) || unsafe.getObjectVolatile(c2600, j) != null) {
                break;
            }
            this = c2600;
        }
        return interfaceC4883M9348;
    }

    @Override // p000.AbstractC5549
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo4904(CancellationException cancellationException) {
        CancellationException cancellationException2;
        C2600 c2600;
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f8689;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof InterfaceC2979) {
                C1078.m2276("Not completed");
                return;
            }
            if (objectVolatile instanceof C5036) {
                return;
            }
            if (objectVolatile instanceof C2381) {
                C2381 c2381 = (C2381) objectVolatile;
                if (c2381.f7896 != null) {
                    C1078.m2276("Must be called at most once");
                    return;
                }
                C2381 c2381M4460 = C2381.m4460(c2381, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = AbstractC3456.f11473;
                    C2600 c2601 = this;
                    if (unsafe2.compareAndSwapObject(c2601, f8689, objectVolatile, c2381M4460)) {
                        C3011 c3011 = c2381.f7897;
                        if (c3011 != null) {
                            c2601.m4907(c3011, cancellationException);
                        }
                        InterfaceC2609 interfaceC2609 = c2381.f7895;
                        if (interfaceC2609 != null) {
                            c2601.m4912(interfaceC2609, cancellationException, c2381.f7898);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(c2601, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        c2600 = c2601;
                        break;
                    }
                    this = c2601;
                }
            } else {
                C2600 c2602 = this;
                CancellationException cancellationException3 = cancellationException;
                C2381 c2382 = new C2381(objectVolatile, (C3011) null, (InterfaceC2609) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    C2381 c2383 = c2382;
                    Unsafe unsafe3 = AbstractC3456.f11473;
                    c2600 = c2602;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(c2600, f8689, objectVolatile, c2383);
                    c2382 = c2383;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(c2600, j) != objectVolatile) {
                        break;
                    } else {
                        c2602 = c2600;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = c2600;
        }
    }

    @Override // p000.AbstractC5549
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo4905(Object obj) {
        return obj instanceof C2381 ? ((C2381) obj).f7898 : obj;
    }

    @Override // p000.InterfaceC2728
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo681(AbstractC4971 abstractC4971, int i) {
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f8687;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                C1078.m2276("invokeOnCancellation should be called at most once");
                return;
            }
            C2600 c2600 = this;
            if (unsafe.compareAndSwapInt(c2600, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                c2600.m4902(abstractC4971);
                return;
            }
            this = c2600;
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public String mo3323() {
        return "CancellableContinuation";
    }

    @Override // p000.InterfaceC4853
    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4853 mo3583() {
        InterfaceC0443 interfaceC0443 = this.f8691;
        if (interfaceC0443 instanceof InterfaceC4853) {
            return (InterfaceC4853) interfaceC0443;
        }
        return null;
    }

    @Override // p000.AbstractC5549
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo4906() {
        return AbstractC3456.f11473.getObjectVolatile(this, f8689);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m4907(C3011 c3011, Throwable th) {
        try {
            switch (c3011.f10146) {
                case 0:
                    ((ScheduledFuture) c3011.f10145).cancel(false);
                    break;
                case 1:
                    ((InterfaceC4745) c3011.f10145).mo211(th);
                    break;
                default:
                    ((InterfaceC4883) c3011.f10145).mo1376();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC1605.m3338(this.f8690, new C1228(0, "Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // p000.InterfaceC4242
    /* JADX INFO: renamed from: ۦِ */
    public final C5536 mo3711(Object obj, InterfaceC2609 interfaceC2609) {
        C2600 c2600;
        C5536 c5536 = AbstractC4009.f13367;
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f8689;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC2979)) {
                return null;
            }
            Object objM4895 = m4895((InterfaceC2979) objectVolatile, obj, this.f18326, interfaceC2609);
            while (true) {
                Unsafe unsafe2 = AbstractC3456.f11473;
                c2600 = this;
                if (unsafe2.compareAndSwapObject(c2600, f8689, objectVolatile, objM4895)) {
                    if (!c2600.m4896()) {
                        c2600.m4900();
                    }
                    return c5536;
                }
                if (unsafe2.getObjectVolatile(c2600, j) != objectVolatile) {
                    break;
                }
                this = c2600;
            }
            this = c2600;
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m4908(InterfaceC4745 interfaceC4745) {
        m4902(new C3011(1, interfaceC4745));
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final Object m4909() {
        InterfaceC3196 interfaceC3196;
        boolean zM4896 = m4896();
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f8687;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    C1078.m2276("Already suspended");
                    return null;
                }
                if (zM4896) {
                    this.m4898();
                }
                Object objectVolatile = unsafe.getObjectVolatile(this, f8689);
                if (objectVolatile instanceof C5036) {
                    throw ((C5036) objectVolatile).f16702;
                }
                int i2 = this.f18326;
                if ((i2 != 1 && i2 != 2) || (interfaceC3196 = (InterfaceC3196) this.f8690.mo865(C1397.f4791)) == null || interfaceC3196.mo866()) {
                    return this.mo4905(objectVolatile);
                }
                CancellationException cancellationExceptionMo862 = interfaceC3196.mo862();
                this.mo4904(cancellationExceptionMo862);
                throw cancellationExceptionMo862;
            }
            C2600 c2600 = this;
            if (unsafe.compareAndSwapInt(c2600, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((InterfaceC4883) unsafe.getObjectVolatile(c2600, f8688)) == null) {
                    c2600.m4903();
                }
                if (zM4896) {
                    c2600.m4898();
                }
                return EnumC2282.f7590;
            }
            this = c2600;
        }
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m4910(Object obj, int i, InterfaceC2609 interfaceC2609) throws C0768 {
        C2600 c2600;
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f8689;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC2979)) {
                C2600 c2601 = this;
                if (objectVolatile instanceof C0554) {
                    C0554 c0554 = (C0554) objectVolatile;
                    if (unsafe.compareAndSwapInt(c0554, C0554.f2000, 0, 1)) {
                        if (interfaceC2609 != null) {
                            c2601.m4912(interfaceC2609, c0554.f16702, obj);
                            return;
                        }
                        return;
                    }
                }
                C5028.m8449(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objM4895 = m4895((InterfaceC2979) objectVolatile, obj, i, interfaceC2609);
            while (true) {
                Unsafe unsafe2 = AbstractC3456.f11473;
                c2600 = this;
                if (unsafe2.compareAndSwapObject(c2600, f8689, objectVolatile, objM4895)) {
                    if (!c2600.m4896()) {
                        c2600.m4900();
                    }
                    c2600.m4899(i);
                    return;
                } else if (unsafe2.getObjectVolatile(c2600, j) != objectVolatile) {
                    break;
                } else {
                    this = c2600;
                }
            }
            this = c2600;
        }
    }

    @Override // p000.InterfaceC4242
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo3712(Object obj, InterfaceC2609 interfaceC2609) throws C0768 {
        m4910(obj, this.f18326, interfaceC2609);
    }

    @Override // p000.AbstractC5549
    /* JADX INFO: renamed from: ۦۙ */
    public final Throwable mo4911(Object obj) {
        Throwable thMo4911 = super.mo4911(obj);
        if (thMo4911 != null) {
            return thMo4911;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m4912(InterfaceC2609 interfaceC2609, Throwable th, Object obj) {
        InterfaceC3534 interfaceC3534 = this.f8690;
        try {
            interfaceC2609.mo1173(th, obj, interfaceC3534);
        } catch (Throwable th2) {
            AbstractC1605.m3338(interfaceC3534, new C1228(0, "Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m4913() {
        InterfaceC4883 interfaceC4883M4903 = m4903();
        if (interfaceC4883M4903 == null) {
            return;
        }
        Unsafe unsafe = AbstractC3456.f11473;
        if (unsafe.getObjectVolatile(this, f8689) instanceof InterfaceC2979) {
            return;
        }
        interfaceC4883M4903.mo1376();
        unsafe.putObjectVolatile(this, f8688, C3364.f11240);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m4914(AbstractC4971 abstractC4971, Throwable th) {
        InterfaceC3534 interfaceC3534 = this.f8690;
        int intVolatile = AbstractC3456.f11473.getIntVolatile(this, f8687) & 536870911;
        if (intVolatile == 536870911) {
            C1078.m2276("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            abstractC4971.mo7625(intVolatile, interfaceC3534);
        } catch (Throwable th2) {
            AbstractC1605.m3338(interfaceC3534, new C1228(0, "Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // p000.InterfaceC4242
    /* JADX INFO: renamed from: ۦۨ */
    public final boolean mo3713(Throwable th) throws C0768 {
        Throwable cancellationException;
        C2600 c2600;
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f8689;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC2979)) {
                return false;
            }
            boolean z = (objectVolatile instanceof C3011) || (objectVolatile instanceof AbstractC4971);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C0554 c0554 = new C0554(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = AbstractC3456.f11473;
                c2600 = this;
                if (unsafe2.compareAndSwapObject(c2600, f8689, objectVolatile, c0554)) {
                    InterfaceC2979 interfaceC2979 = (InterfaceC2979) objectVolatile;
                    if (interfaceC2979 instanceof C3011) {
                        c2600.m4907((C3011) objectVolatile, th);
                    } else if (interfaceC2979 instanceof AbstractC4971) {
                        c2600.m4914((AbstractC4971) objectVolatile, th);
                    }
                    if (!c2600.m4896()) {
                        c2600.m4900();
                    }
                    c2600.m4899(c2600.f18326);
                    return true;
                }
                if (unsafe2.getObjectVolatile(c2600, j) != objectVolatile) {
                    break;
                }
                this = c2600;
            }
            this = c2600;
        }
    }
}
