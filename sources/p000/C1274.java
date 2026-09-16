package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: ۥٍٓؔۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C1274 extends AbstractC1434 {
    /* JADX INFO: renamed from: ۥٛ */
    public static Font m2702(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM2703 = m2703(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM2704 = m2703(fontStyle, font2.getStyle());
            if (iM2704 < iM2703) {
                font = font2;
                iM2703 = iM2704;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static int m2703(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX INFO: renamed from: ۥۤ */
    public final FontFamily m2704(C5056[] c5056Arr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (C5056 c5056 : c5056Arr) {
            if (Objects.equals(c5056.f16790.getScheme(), "systemfont")) {
                fontBuild = mo2705(c5056);
            } else {
                try {
                    Uri uri = c5056.f16790;
                    String str = c5056.f16787;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c5056.f16786).setSlant(c5056.f16791 ? 1 : 0).setTtcIndex(c5056.f16789);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: ۦؒ */
    public Font mo2705(C5056 c5056) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۦؚ */
    public final Typeface mo2706(Context context, C5056[] c5056Arr, int i) {
        try {
            FontFamily fontFamilyM2704 = m2704(c5056Arr, context.getContentResolver());
            if (fontFamilyM2704 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM2704).setStyle(m2702(fontFamilyM2704, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۦٌ */
    public final Typeface mo2707(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM2704 = m2704((C5056[]) list.get(0), contentResolver);
            if (fontFamilyM2704 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM2704);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyM2705 = m2704((C5056[]) list.get(i2), contentResolver);
                if (fontFamilyM2705 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM2705);
                }
            }
            return customFallbackBuilder.setStyle(m2702(fontFamilyM2704, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۦۗ */
    public final Typeface mo2708(Context context, C2293 c2293, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C0920 c0920 : c2293.f7620) {
                try {
                    Font fontBuild = new Font.Builder(resources, c0920.f3298).setWeight(c0920.f3299).setSlant(c0920.f3296 ? 1 : 0).setTtcIndex(c0920.f3297).setFontVariationSettings(c0920.f3301).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m2702(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۦۚ */
    public final Typeface mo2709(Context context, Resources resources, int i, String str) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
