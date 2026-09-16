package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: ۦۥۣؖٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5720 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: ۥْ */
    public final String f18825;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C3644 f18826;

    /* JADX INFO: renamed from: ۦ۟ */
    public final boolean f18827;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f18828;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5720(C3644 c3644, Callable callable, boolean z) {
        super(callable);
        this.f18826 = c3644;
        long andIncrement = C3644.f12196.getAndIncrement();
        this.f18828 = andIncrement;
        this.f18825 = "Task exception on worker thread";
        this.f18827 = z;
        if (andIncrement == Long.MAX_VALUE) {
            C3610 c3610 = ((C5371) c3644.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9432("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C5720 c5720 = (C5720) obj;
        boolean z = c5720.f18827;
        boolean z2 = this.f18827;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = c5720.f18828;
        long j2 = this.f18828;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        C3610 c3610 = ((C5371) this.f18826.f18660).f17717;
        C5371.m9020(c3610);
        c3610.f12025.m9430(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        C3610 c3610 = ((C5371) this.f18826.f18660).f17717;
        C5371.m9020(c3610);
        c3610.f12020.m9430(th, this.f18825);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5720(C3644 c3644, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f18826 = c3644;
        long andIncrement = C3644.f12196.getAndIncrement();
        this.f18828 = andIncrement;
        this.f18825 = str;
        this.f18827 = z;
        if (andIncrement == Long.MAX_VALUE) {
            C3610 c3610 = ((C5371) c3644.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9432("Tasks index overflow");
        }
    }
}
