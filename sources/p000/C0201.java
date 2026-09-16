package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۥؑؕٚٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0201 implements Cloneable {

    /* JADX INFO: renamed from: ۥؓ */
    public volatile boolean f732;

    /* JADX INFO: renamed from: ۥؖ */
    public boolean f733;

    /* JADX INFO: renamed from: ۥً */
    public volatile C3641 f734;

    /* JADX INFO: renamed from: ۥَ */
    public final AtomicBoolean f735;

    /* JADX INFO: renamed from: ۥْ */
    public final C0615 f736;

    /* JADX INFO: renamed from: ۥٓ */
    public final C5354 f737;

    /* JADX INFO: renamed from: ۥٖ */
    public Object f738;

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f739;

    /* JADX INFO: renamed from: ۥۖ */
    public C4752 f740;

    /* JADX INFO: renamed from: ۥۧ */
    public volatile C4752 f741;

    /* JADX INFO: renamed from: ۦٕ */
    public boolean f742;

    /* JADX INFO: renamed from: ۦٗ */
    public C4087 f743;

    /* JADX INFO: renamed from: ۦۛ */
    public C3641 f744;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2813 f745;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2561 f746;

    public C0201(C2561 c2561, C2813 c2813) {
        this.f746 = c2561;
        this.f745 = c2813;
        this.f736 = (C0615) c2561.f8549.f14025;
        C5354 c5354 = new C5354(this);
        c5354.mo3923(0L);
        this.f737 = c5354;
        this.f735 = new AtomicBoolean();
        this.f733 = true;
    }

    public final void cancel() {
        Socket socket;
        if (this.f732) {
            return;
        }
        this.f732 = true;
        C4752 c4752 = this.f741;
        if (c4752 != null) {
            ((InterfaceC4559) c4752.f15688).cancel();
        }
        C3641 c3641 = this.f734;
        if (c3641 == null || (socket = c3641.f12177) == null) {
            return;
        }
        AbstractC4031.m7222(socket);
    }

    public final Object clone() {
        return new C0201(this.f746, this.f745);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final IOException m458(IOException iOException) {
        Socket socketM464;
        byte[] bArr = AbstractC4031.f13451;
        C3641 c3641 = this.f744;
        if (c3641 != null) {
            synchronized (c3641) {
                socketM464 = m464();
            }
            if (this.f744 == null) {
                if (socketM464 != null) {
                    AbstractC4031.m7222(socketM464);
                }
            } else if (socketM464 != null) {
                C1078.m2276("Check failed.");
                return null;
            }
        }
        if (!this.f737.m9680()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m459(boolean z) {
        C4752 c4752;
        synchronized (this) {
            if (!this.f733) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (c4752 = this.f741) != null) {
            ((InterfaceC4559) c4752.f15688).cancel();
            ((C0201) c4752.f15686).m465(c4752, true, true, null);
        }
        this.f740 = null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006c  */
    /* JADX INFO: renamed from: ۥّ */
    public final C2147 m460() throws Throwable {
        ArrayList arrayList = new ArrayList();
        AbstractC3649.m6529(this.f746.f8541, arrayList);
        arrayList.add(new C3758(this.f746));
        int i = 1;
        arrayList.add(new C3758(i));
        arrayList.add(new C3758(2));
        arrayList.add(C3758.f12519);
        AbstractC3649.m6529(this.f746.f8542, arrayList);
        arrayList.add(new C3758(3));
        C2813 c2813 = this.f745;
        try {
            C2147 c2147M1858 = new C0870(this, arrayList, 0, null, c2813).m1858(c2813);
            if (this.f732) {
                AbstractC4031.m7212(c2147M1858);
                throw new IOException("Canceled");
            }
            m461(null);
            return c2147M1858;
        } catch (IOException e) {
            try {
                throw m461(e);
            } catch (Throwable th) {
                th = th;
                if (i == 0) {
                    m461(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 0;
            if (i == 0) {
                m461(null);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final IOException m461(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f733) {
                this.f733 = false;
                if (!this.f742 && !this.f739) {
                    z = true;
                }
            }
        }
        return z ? m458(iOException) : iOException;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m462(C3641 c3641) {
        byte[] bArr = AbstractC4031.f13451;
        if (this.f744 != null) {
            C1078.m2276("Check failed.");
        } else {
            this.f744 = c3641;
            c3641.f12191.add(new C1731(this, this.f738));
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m463(InterfaceC5578 interfaceC5578) {
        RunnableC3850 runnableC3850;
        if (!this.f735.compareAndSet(false, true)) {
            C1078.m2276("Already Executed");
            return;
        }
        C3216 c3216 = C3216.f10772;
        this.f738 = C3216.f10772.mo5908();
        C1489 c1489 = this.f746.f8550;
        RunnableC3850 runnableC3851 = new RunnableC3850(this, interfaceC5578);
        synchronized (c1489) {
            ((ArrayDeque) c1489.f5057).add(runnableC3851);
            String str = ((C0774) this.f745.f9393).f2801;
            Iterator it = ((ArrayDeque) c1489.f5058).iterator();
            do {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) c1489.f5057).iterator();
                    do {
                        if (!it2.hasNext()) {
                            runnableC3850 = null;
                            break;
                        }
                        runnableC3850 = (RunnableC3850) it2.next();
                    } while (!AbstractC3831.m6874(((C0774) runnableC3850.f12868.f745.f9393).f2801, str));
                } else {
                    runnableC3850 = (RunnableC3850) it.next();
                }
            } while (!AbstractC3831.m6874(((C0774) runnableC3850.f12868.f745.f9393).f2801, str));
            if (runnableC3850 != null) {
                runnableC3851.f12869 = runnableC3850.f12869;
            }
        }
        c1489.m3161();
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final Socket m464() {
        C3641 c3641 = this.f744;
        byte[] bArr = AbstractC4031.f13451;
        ArrayList arrayList = c3641.f12191;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (AbstractC3831.m6874(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            C1078.m2276("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.f744 = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        c3641.f12180 = System.nanoTime();
        C0615 c0615 = this.f736;
        C2324 c2324 = (C2324) c0615.f2295;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0615.f2297;
        byte[] bArr2 = AbstractC4031.f13451;
        if (!c3641.f12186) {
            c2324.m4367((C1841) c0615.f2294, 0L);
            return null;
        }
        c3641.f12186 = true;
        concurrentLinkedQueue.remove(c3641);
        if (concurrentLinkedQueue.isEmpty()) {
            c2324.m4370();
        }
        return c3641.f12183;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x001d A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:8:0x000e, B:17:0x001d, B:19:0x0021, B:20:0x0023, B:22:0x0027, B:27:0x0030, B:29:0x0034, B:14:0x0017), top: B:53:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0021 A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:8:0x000e, B:17:0x001d, B:19:0x0021, B:20:0x0023, B:22:0x0027, B:27:0x0030, B:29:0x0034, B:14:0x0017), top: B:53:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:25:0x002d  */
    /* JADX INFO: renamed from: ۦۙ */
    public final IOException m465(C4752 c4752, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (c4752.equals(this.f741)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (this.f742) {
                            if (z) {
                                this.f742 = false;
                            }
                            if (z2) {
                                this.f739 = false;
                            }
                            z5 = this.f742;
                            if (z5) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (!z5) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        } else if (z2 || !this.f739) {
                            z4 = false;
                        } else {
                            if (z) {
                                this.f742 = false;
                            }
                            if (z2) {
                                this.f739 = false;
                            }
                            z5 = this.f742;
                            if (z5 || this.f739) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!z5 && !this.f739 && !this.f733) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                }
            }
            if (z3) {
                this.f741 = null;
                C3641 c3641 = this.f744;
                if (c3641 != null) {
                    synchronized (c3641) {
                        c3641.f12185++;
                    }
                }
            }
            if (z4) {
                return m458(iOException);
            }
        }
        return iOException;
    }
}
