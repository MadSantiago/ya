package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.View;

/* JADX INFO: renamed from: ۥ۟ۚٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2477 extends URLSpan {

    /* JADX INFO: renamed from: ۥْ */
    public final C4992 f8255;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f8256;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5728 f8257;

    public C2477(C5728 c5728, String str, C4992 c4992) {
        super(str);
        this.f8257 = c5728;
        this.f8256 = str;
        this.f8255 = c4992;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f8255.getClass();
        String str = this.f8256;
        Uri uriBuild = Uri.parse(str);
        if (TextUtils.isEmpty(uriBuild.getScheme())) {
            uriBuild = uriBuild.buildUpon().scheme("https").build();
        }
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f8257.f18876);
        textPaint.setColor(textPaint.linkColor);
    }
}
