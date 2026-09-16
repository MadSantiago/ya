package p000;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦ۠ؓؖؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5389 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f17810;

    /* JADX INFO: renamed from: ۥۜ */
    public C5322 f17814;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f17815;

    /* JADX INFO: renamed from: ۦٛ */
    public C5471 f17818;

    /* JADX INFO: renamed from: ۥۗ */
    public final AtomicReference f17813 = new AtomicReference(null);

    /* JADX INFO: renamed from: ۦؑ */
    public final C4164 f17816 = new C4164(22, this);

    /* JADX INFO: renamed from: ۥُ */
    public final C4884 f17811 = new C4884(14, this);

    /* JADX INFO: renamed from: ۥّ */
    public final C0863 f17812 = new C0863(new C5471[16]);

    /* JADX INFO: renamed from: ۦۙ */
    public final Object f17819 = new Object();

    /* JADX INFO: renamed from: ۦِ */
    public long f17817 = -1;

    public C5389(InterfaceC4745 interfaceC4745) {
        this.f17815 = interfaceC4745;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x021c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥؗ */
    public final void m9077(Object obj, InterfaceC4745 interfaceC4745, InterfaceC4448 interfaceC4448) {
        C0863 c0863;
        Object obj2;
        C5471 c5471;
        boolean z;
        C5471 c5472;
        long j;
        long j2;
        C5471 c5473;
        AbstractC3191 c4336;
        long j3;
        C1254 c1254;
        int i;
        long j4;
        C1254 c1255;
        long jM6841 = AbstractC3831.m6841();
        synchronized (this.f17819) {
            c0863 = this.f17812;
            Object[] objArr = c0863.f3182;
            int i2 = c0863.f3180;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((C5471) obj2).f18043 == interfaceC4745) {
                    break;
                } else {
                    i3++;
                }
            }
            c5471 = (C5471) obj2;
            z = true;
            if (c5471 == null) {
                AbstractC3801.m6782(1, interfaceC4745);
                c5471 = new C5471(interfaceC4745);
                c0863.m1843(c5471);
            }
            c5472 = this.f17818;
            j = this.f17817;
        }
        Object obj3 = c0863;
        if (j != -1 && j != jM6841) {
            obj3 = c0863;
            AbstractC0371.m795("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + jM6841 + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            obj3 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
        }
        try {
            obj3 = c0863;
            synchronized (this.f17819) {
                try {
                    this.f17818 = c5471;
                    this.f17817 = jM6841;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj3;
                }
            }
            C4884 c4884 = this.f17811;
            Object obj4 = c5471.f18041;
            C1254 c1256 = c5471.f18038;
            int i4 = c5471.f18044;
            c5471.f18041 = obj;
            c5471.f18038 = (C1254) c5471.f18040.m6027(obj);
            if (c5471.f18044 == -1) {
                c5471.f18044 = Long.hashCode(AbstractC1538.m3278().mo5118());
            }
            C1913 c1913 = c5471.f18048;
            C0863 c0863M5601 = AbstractC3004.m5601();
            try {
                c0863M5601.m1843(c1913);
                if (c4884 == null) {
                    interfaceC4448.mo449();
                    c5473 = c5471;
                } else {
                    AbstractC3191 abstractC3191 = (AbstractC3191) AbstractC1538.f5206.get();
                    if (abstractC3191 instanceof C4336) {
                        c5473 = c5471;
                        if (((C4336) abstractC3191).f14316 == AbstractC3831.m6841()) {
                            InterfaceC4745 interfaceC4746 = ((C4336) abstractC3191).f14315;
                            InterfaceC4745 interfaceC4747 = ((C4336) abstractC3191).f14313;
                            try {
                                ((C4336) abstractC3191).f14315 = AbstractC1538.m3285(c4884, interfaceC4746, true);
                                ((C4336) abstractC3191).f14313 = interfaceC4747;
                                interfaceC4448.mo449();
                                ((C4336) abstractC3191).f14315 = interfaceC4746;
                                ((C4336) abstractC3191).f14313 = interfaceC4747;
                            } catch (Throwable th2) {
                                ((C4336) abstractC3191).f14315 = interfaceC4746;
                                ((C4336) abstractC3191).f14313 = interfaceC4747;
                                throw th2;
                            }
                        }
                    } else {
                        c5473 = c5471;
                    }
                    if (abstractC3191 == null || (abstractC3191 instanceof C5038)) {
                        c4336 = new C4336(abstractC3191 instanceof C5038 ? (C5038) abstractC3191 : null, c4884, null, true, false);
                    } else {
                        c4336 = abstractC3191.mo4469(c4884);
                    }
                    try {
                        AbstractC3191 abstractC3191M5883 = c4336.m5883();
                        try {
                            interfaceC4448.mo449();
                            AbstractC3191.m5876(abstractC3191M5883);
                            c4336.mo2657();
                        } catch (Throwable th3) {
                            try {
                                AbstractC3191.m5876(abstractC3191M5883);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    c4336.mo2657();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    c0863M5601.m1850(c0863M5601.f3180 - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                c0863M5601.m1850(c0863M5601.f3180 - 1);
                C5471 c5474 = c5473;
                Object obj5 = c5474.f18041;
                int i5 = c5474.f18044;
                C1254 c1257 = c5474.f18038;
                if (c1257 != null) {
                    try {
                        long[] jArr = c1257.f4319;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                C1254 c1258 = c1257;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            c1255 = c1258;
                                            Object obj6 = c1255.f4318[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = c1255.f4315[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    c5474.m9163(obj5, obj6);
                                                }
                                                if (z3) {
                                                    c1255.m2651(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.f17819) {
                                                    this.f17818 = c5472;
                                                    this.f17817 = j2;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j5;
                                            c1255 = c1258;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        c1258 = c1255;
                                        j5 = j4 >> 8;
                                        j = j6;
                                    }
                                    c1254 = c1258;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    c1254 = c1258;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                c1257 = c1254;
                                z = z2;
                                j = j3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.f17819) {
                            this.f17818 = c5472;
                            this.f17817 = j2;
                            throw th;
                        }
                    }
                } else {
                    j3 = j;
                }
                c5474.f18041 = obj4;
                c5474.f18038 = c1256;
                c5474.f18044 = i4;
                synchronized (this.f17819) {
                    this.f17818 = c5472;
                    this.f17817 = j3;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m9078() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.f17819) {
            z = this.f17810;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.f17813;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC5508.m9200("Unexpected notification");
                        C1078.m2274();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.f17819) {
                C0863 c0863 = this.f17812;
                Object[] objArr = c0863.f3182;
                int i = c0863.f3180;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((C5471) objArr[i2]).m9165(set) || z2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m9079() {
        synchronized (this.f17819) {
            C0863 c0863 = this.f17812;
            Object[] objArr = c0863.f3182;
            int i = c0863.f3180;
            for (int i2 = 0; i2 < i; i2++) {
                C5471 c5471 = (C5471) objArr[i2];
                c5471.f18039.m6020();
                c5471.f18040.m6020();
                c5471.f18045.m6020();
                c5471.f18046.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m9080() {
        C4164 c4164 = this.f17816;
        AbstractC1538.m3277(AbstractC1538.f5208);
        synchronized (AbstractC1538.f5203) {
            AbstractC1538.f5207 = AbstractC0973.m2046(AbstractC1538.f5207, c4164);
        }
        this.f17814 = new C5322(9, c4164);
    }
}
