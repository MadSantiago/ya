package p000;

import android.content.ComponentName;

/* JADX INFO: renamed from: ۦُۣؒؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5585 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ ComponentName f18417;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ BinderC4778 f18418;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18419;

    public /* synthetic */ RunnableC5585(BinderC4778 binderC4778, ComponentName componentName, int i) {
        this.f18419 = i;
        this.f18418 = binderC4778;
        this.f18417 = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f18419;
        ComponentName componentName = this.f18417;
        BinderC4778 binderC4778 = this.f18418;
        switch (i) {
            case 0:
                componentName.getClassName();
                binderC4778.m8161(-1, componentName);
                break;
            default:
                binderC4778.f15761.remove(componentName);
                break;
        }
    }
}
