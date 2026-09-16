package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: renamed from: ۦؖؑؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3319 extends View {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ RunnableC4991 f11125;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3319(RunnableC4991 runnableC4991, Context context) {
        super(context);
        this.f11125 = runnableC4991;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        this.f11125.run();
    }
}
