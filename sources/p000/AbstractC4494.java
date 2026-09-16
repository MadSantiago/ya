package p000;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: ۦٙؕۚٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4494 {
    /* JADX INFO: renamed from: ۥۗ */
    public static C5336 m7823(View view, C5336 c5336) {
        ContentInfo contentInfoMo839 = c5336.f17592.mo839();
        Objects.requireNonNull(contentInfoMo839);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo839);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo839 ? c5336 : new C5336(new C4228(contentInfoPerformReceiveContent));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static String[] m7824(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
