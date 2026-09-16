package p000;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: ۦؘُؐٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3929 extends C1274 {
    @Override // p000.C1274
    /* JADX INFO: renamed from: ۦؒ */
    public final Font mo2705(C5056 c5056) {
        Font fontM5900;
        Uri uri = c5056.f16790;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = c5056.f16787;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontM5900 = AbstractC3211.m5900(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontM5900;
                }
                try {
                    return new Font.Builder(fontM5900).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
