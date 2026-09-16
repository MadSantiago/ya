package ru.bluecat.yandexmapspatcher.p003ui.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import p000.AbstractC0912;
import p000.AbstractC2765;
import p000.AbstractC4009;
import p000.AbstractC4225;
import p000.AbstractC4489;
import p000.AbstractC4593;
import p000.C0649;
import p000.C0743;
import p000.C1298;
import p000.C1880;
import p000.C2718;
import p000.C2972;
import p000.C3436;
import p000.ExecutorC4540;
import p000.InterfaceC0443;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class UpdateJob extends Worker {

    /* JADX INFO: renamed from: ۥُ */
    public final C1880 f419;

    /* JADX INFO: renamed from: ۥّ */
    public final Context f420;

    public UpdateJob(C1880 c1880, Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f419 = c1880;
        this.f420 = context;
    }

    @Override // androidx.work.Worker
    /* JADX INFO: renamed from: ۥۣ */
    public final C2972 mo82() {
        Context context = this.f420;
        if (AbstractC4489.m7814(context) && AbstractC4489.m7772(context)) {
            String str = C3436.f11406;
            if (Build.VERSION.SDK_INT < 33 || AbstractC4225.m7487(context, C3436.f11406) == 0) {
                C0743 c0743 = new C0743(C1298.f4446, 3);
                C0649 c0649 = AbstractC0912.f3276;
                AbstractC2765.m5135(AbstractC4009.m7151(AbstractC4593.m7963(ExecutorC4540.f15006, c0743)), null, 0, new C2718(this, (InterfaceC0443) null, 22), 3);
            }
        }
        return new C2972();
    }
}
