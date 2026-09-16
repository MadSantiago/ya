package p000;

import android.util.LruCache;
import java.io.File;

/* JADX INFO: renamed from: ۦًؘٖٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4324 extends LruCache {
    @Override // android.util.LruCache
    public final Object create(Object obj) {
        return new File((String) obj);
    }
}
