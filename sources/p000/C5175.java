package p000;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: renamed from: ۦَۚؔٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5175 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final String f17125 = C1984.m3875("SystemJobInfoConverter");

    /* JADX INFO: renamed from: ۥۣ */
    public final ComponentName f17126;

    public C5175(Context context, C4575 c4575) {
        this.f17126 = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
