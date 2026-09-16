package p000;

import android.view.View;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦُ۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3937 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3262 f13146;

    static {
        long[] jArr = AbstractC5064.f16815;
        f13146 = new C3262();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final AbstractC2109 m7103(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC2109) {
            return (AbstractC2109) tag;
        }
        return null;
    }
}
