package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: ۦ٘ؔۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4432 implements InterfaceC0964 {

    /* JADX INFO: renamed from: ۥۜ */
    public static final String f14605;

    /* JADX INFO: renamed from: ۦٛ */
    public static final byte[] f14606;

    /* JADX INFO: renamed from: ۦۙ */
    public static final ArrayList f14607 = new ArrayList(0);

    /* JADX INFO: renamed from: ۥؗ */
    public List f14608;

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ int f14609;

    /* JADX INFO: renamed from: ۥّ */
    public Object f14610;

    /* JADX INFO: renamed from: ۥۗ */
    public List f14611;

    /* JADX INFO: renamed from: ۥۣ */
    public final ArrayList f14612;

    /* JADX INFO: renamed from: ۦؑ */
    public C1039 f14613;

    static {
        String string = UUID.randomUUID().toString();
        f14605 = string;
        f14606 = String.format("__RET=$?;echo %1$s;echo %1$s >&2;echo $__RET;unset __RET\n", string).getBytes(StandardCharsets.UTF_8);
    }

    public C4432(byte b) {
        this.f14612 = new ArrayList();
        this.f14611 = null;
        this.f14608 = f14607;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m7724(String... strArr) {
        if (strArr.length > 0) {
            this.f14612.add(new C2253(strArr));
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m7725() {
        try {
            try {
                AbstractC2552.m4818().m6033(this);
            } catch (IOException unused) {
            }
        } catch (C0887 unused2) {
            m7726();
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m7726() {
        Iterator it = this.f14612.iterator();
        while (it.hasNext()) {
            ((C2253) it.next()).getClass();
        }
        C0918 c0918 = new C0918(1);
        C1039 c1039 = this.f14613;
        if (c1039 != null) {
            c1039.f3672 = c0918;
        }
    }

    @Override // p000.InterfaceC0964
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2002(OutputStream outputStream, InputStream inputStream, InputStream inputStream2) {
        ArrayList arrayList = this.f14612;
        List listSynchronizedList = this.f14611;
        ArrayList arrayList2 = f14607;
        boolean z = listSynchronizedList == arrayList2;
        boolean z2 = this.f14608 == arrayList2;
        List list = null;
        if (z) {
            listSynchronizedList = this.f14613 == null ? null : new ArrayList();
        }
        if (!z2) {
            list = this.f14608;
        } else if (C3267.f10969) {
            list = listSynchronizedList;
        }
        if (listSynchronizedList != null && listSynchronizedList == list) {
            Class<?> cls = AbstractC2774.f9245;
            if (cls == null) {
                cls = Collections.synchronizedCollection(Collections.EMPTY_LIST).getClass();
                AbstractC2774.f9245 = cls;
            }
            if (!cls.isInstance(listSynchronizedList)) {
                listSynchronizedList = Collections.synchronizedList(listSynchronizedList);
                list = listSynchronizedList;
            }
        }
        FutureTask futureTask = new FutureTask(new CallableC2907(inputStream, listSynchronizedList, 1));
        FutureTask futureTask2 = new FutureTask(new CallableC2907(inputStream2, list, 0));
        ExecutorService executorService = C3267.f10970;
        executorService.execute(futureTask);
        executorService.execute(futureTask2);
        C0918 c0918 = new C0918(1);
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C2253) it.next()).m4297(outputStream);
            }
            outputStream.write(f14606);
            outputStream.flush();
            int iIntValue = ((Integer) futureTask.get()).intValue();
            futureTask2.get();
            c0918.f3292 = iIntValue;
            c0918.f3293 = listSynchronizedList;
        } catch (IOException e) {
            e = e;
            AbstractC2774.m5205("LIBSU", e);
        } catch (InterruptedException e2) {
            e = e2;
            AbstractC2774.m5205("LIBSU", e);
        } catch (ExecutionException e3) {
            e = e3;
            AbstractC2774.m5205("LIBSU", e);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C2253) it2.next()).getClass();
        }
        C1039 c1039 = this.f14613;
        if (c1039 != null) {
            c1039.f3672 = c0918;
        }
    }

    @Override // p000.InterfaceC0964
    /* JADX INFO: renamed from: ۥۣ */
    public void mo2003() {
        switch (this.f14609) {
            case 0:
                RunnableC0029 runnableC0029 = (RunnableC0029) this.f14610;
                if (runnableC0029 == null) {
                    m7726();
                } else {
                    this.f14610 = null;
                    runnableC0029.run();
                }
                break;
            default:
                m7726();
                break;
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C0918 m7727() {
        boolean z = false;
        int i = 5;
        switch (this.f14609) {
            case 0:
                this.f14610 = new RunnableC0029(13, this);
                C1039 c1039 = new C1039(i, z);
                this.f14613 = c1039;
                m7725();
                C0918 c0918 = (C0918) c1039.f3672;
                return c0918 == null ? new C0918(1) : c0918;
            default:
                C1039 c10310 = new C1039(i, z);
                this.f14613 = c10310;
                try {
                    ((C3267) this.f14610).m6033(this);
                    break;
                } catch (IOException unused) {
                }
                C0918 c0919 = (C0918) c10310.f3672;
                return c0919 == null ? new C0918(1) : c0919;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4432(C3267 c3267) {
        this((byte) 0);
        this.f14609 = 1;
        this.f14610 = c3267;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4432() {
        this((byte) 0);
        this.f14609 = 0;
    }
}
